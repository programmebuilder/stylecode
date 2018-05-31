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
  
  //검색 후 페이지 번호를 클릭했을 때 URL
  public String makeSearch(int page){
    
    UriComponents uriComponents=
                UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("perPageNum", cri.getPerPageNum())
                .queryParam("searchKey", ((ShoppingMallSearchVO)cri).getSearchKey())
                .build(); 
    
    return uriComponents.toUriString();
  } 
  
//필터링 후 페이지 번호를 클릭했을 때 URL
  public String makeFilter(int page) {
	  	
	  	//스타일과 나이대는 리스트 형태로 가지고 있으므로 String으로 풀어서 써주기 위해 만든 변수
	    String styleParam="";
	    String ageParam="";
	    
	    //배열인 스타일과 나이대를 처리해주기 위한 for문 
	    //style=모던시크&style=심플베이직 형태로 만들기 위해서 두 번째 배열 값부터 &를 직접 넣어준다
		if (((SpmFilterVO) cri).getStyle()!=null) {
			for (int i = 0; i < ((SpmFilterVO) cri).getStyle().length; i++) {
				if (i == 0) { //첫 번째 배열 값은 &style을 해주지 않아도 style=모던시크 형태로 들어감
					styleParam =((SpmFilterVO) cri).getStyle()[i];
				} else {
					styleParam = styleParam + "&style=" + ((SpmFilterVO) cri).getStyle()[i];
				}
			}
		}
		//age 처리 부분
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
		
		//style이나 age필터 조건이 없을 경우 에러가 발생하므로 각 상황에 맞는 if문 처리
		if(styleParam=="" || ageParam=="") {
			//style과 age필터 조건 모두 없을 경우
			if(styleParam=="" && ageParam=="") {
			    uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .build(); 
			  //style필터 조건 없을 경우
			} else if(styleParam=="") {
	    		uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("age", ageParam)
		                .build();
	    	  //age필터 조건 없을 경우
			} else if(ageParam=="") {
				uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("style", styleParam)
		                .build(); 
			}
		//필터 조건 모두 있을 경우
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
