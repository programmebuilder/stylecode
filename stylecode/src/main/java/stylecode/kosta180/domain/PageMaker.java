package stylecode.kosta180.domain;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {

  private int totalCount;
  private int startPage;
  private int endPage;
  private boolean prev;
  private boolean next;

  private int displayPageNum = 5; //?��면에 보여�??�� ?��?���? 번호?�� ?��

  private Criteria cri;

  public void setCri(Criteria cri) {
    this.cri = cri;
  }

  public void setTotalCount(int totalCount) {
    this.totalCount = totalCount;

    calcData();
  }

  private void calcData() {

    endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);

    startPage = (endPage - displayPageNum) + 1;

    int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));

    if (endPage > tempEndPage) {
      endPage = tempEndPage;
    }

    prev = startPage == 1 ? false : true;

    next = endPage * cri.getPerPageNum() >= totalCount ? false : true;

  }

  public int getTotalCount() {
    return totalCount;
  }

  public int getStartPage() {
    return startPage;
  }

  public int getEndPage() {
    return endPage;
  }

  public boolean isPrev() {
    return prev;
  }

  public boolean isNext() {
    return next;
  }

  public int getDisplayPageNum() {
    return displayPageNum;
  }

  public Criteria getCri() {
    return cri;
  }

  public String makeQuery(int page) {

    UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParam("page", page)
        .queryParam("perPageNum", cri.getPerPageNum()).build();

    return uriComponents.toUriString();
  }
  
  //�??�� ?�� ?��?���? 번호�? ?���??��?�� ?�� URL
  public String makeSearch(int page){
    
    UriComponents uriComponents=
                UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("perPageNum", cri.getPerPageNum())
                .queryParam("searchKey", ((ShoppingMallSearchVO)cri).getSearchKey())
                .build(); 
    
    return uriComponents.toUriString();
  } 
  
//?��?���? ?�� ?��?���? 번호�? ?���??��?�� ?�� URL
  public String makeFilter(int page) {
	  	
	  	//?��???���? ?��?��???�� 리스?�� ?��?���? �?�?�? ?��?���?�? String?���? ???��?�� ?��주기 ?��?�� 만든 �??��
	    String styleParam="";
	    String ageParam="";
	    
	    //배열?�� ?��???���? ?��?��??�? 처리?��주기 ?��?�� for�? 
	    //style=모던?��?��&style=?��?��베이�? ?��?���? 만들�? ?��?��?�� ?�� 번째 배열 값�??�� &�? 직접 ?��?���??��
		if (((SpmFilterVO) cri).getStyle()!=null) {
			for (int i = 0; i < ((SpmFilterVO) cri).getStyle().length; i++) {
				if (i == 0) { //�? 번째 배열 값�? &style?�� ?��주�? ?��?��?�� style=모던?��?�� ?��?���? ?��?���?
					styleParam =((SpmFilterVO) cri).getStyle()[i];
				} else {
					styleParam = styleParam + "&style=" + ((SpmFilterVO) cri).getStyle()[i];
				}
			}
		}
		//age 처리 �?�?
		if (((SpmFilterVO) cri).getAge()!=null) {
			for (int i = 0; i < ((SpmFilterVO) cri).getAge().length; i++) {
				if (i == 0) {
					ageParam =((SpmFilterVO) cri).getAge()[i];
				} else {
					ageParam = ageParam+"&age=" + ((SpmFilterVO) cri).getAge()[i];
				}
			}
		}
		
		UriComponents uriComponents=null;
		
		//style?��?�� age?��?�� 조건?�� ?��?�� 경우 ?��?���? 발생?���?�? �? ?��?��?�� 맞는 if�? 처리
		if(styleParam=="" || ageParam=="") {
			//style�? age?��?�� 조건 모두 ?��?�� 경우
			if(styleParam=="" && ageParam=="") {
			    uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .build(); 
			  //style?��?�� 조건 ?��?�� 경우
			} else if(styleParam=="") {
	    		uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("age", ageParam)
		                .build();
	    	  //age?��?�� 조건 ?��?�� 경우
			} else if(ageParam=="") {
				uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("style", styleParam)
		                .build(); 
			}
		//?��?�� 조건 모두 ?��?�� 경우
		} else {
    		uriComponents=
	                UriComponentsBuilder.newInstance()
	                .queryParam("page", page)
	                .queryParam("perPageNum", cri.getPerPageNum())
	                .queryParam("category", ((SpmFilterVO)cri).getCategory())
	                .queryParam("style", styleParam)
	                .queryParam("age", ageParam)
	                .build();
		}
	   
	    return uriComponents.toUriString();
  }
  
  private String encoding(String searchKey) {
	  if(searchKey==null || searchKey.trim().length()==0) {
		  return "";
	  }
	  try {
		  return URLEncoder.encode(searchKey, "UTF-8");
	} catch (UnsupportedEncodingException e) {
		return "";
	}
  }
}
