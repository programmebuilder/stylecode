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

  private int displayPageNum = 5; //화면에 보여지는 페이지 번호의 수

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
  
  
  public String makeSearch(int page){
    
    UriComponents uriComponents=
                UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("perPageNum", cri.getPerPageNum())
                .queryParam("searchKey", ((ShoppingMallSearchVO)cri).getSearchKey())
                .build(); 
    
    return uriComponents.toUriString();
  } 
  
  public String makeFilter(int page) {
	    String styleParam="";
	    String ageParam="";
	    
	  //배열인 스타일과 나이대를 처리해주기 위한 for문 
		if (((SpmFilterVO) cri).getStyle()!=null) {
			for (int i = 0; i < ((SpmFilterVO) cri).getStyle().length; i++) {
				if (i == 0) {
					styleParam =((SpmFilterVO) cri).getStyle()[i];
				} else {
					styleParam = styleParam + "&style=" + ((SpmFilterVO) cri).getStyle()[i];
				}
			}
		}
		
		if (((SpmFilterVO) cri).getAge()!=null) {
			for (int i = 0; i < ((SpmFilterVO) cri).getAge().length; i++) {
				System.out.println(((SpmFilterVO) cri).getAge()[i]);
				if (i == 0) {
					ageParam =((SpmFilterVO) cri).getAge()[i];
				} else {
					ageParam = ageParam+"&age=" + ((SpmFilterVO) cri).getAge()[i];
				}
			}
		}
	    
	    UriComponents uriComponents=
	                UriComponentsBuilder.newInstance()
	                .queryParam("page", page)
	                .queryParam("perPageNum", cri.getPerPageNum())
	                .queryParam("category", ((SpmFilterVO)cri).getCategory())
	                .queryParam("style", styleParam==""?"=":styleParam)
	                .queryParam("age", ageParam==""?"=":ageParam)
	                .build(); 
	   
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