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

  private int displayPageNum = 5; //?λ©΄μ λ³΄μ¬μ§?? ??΄μ§? λ²νΈ? ?

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
  
  //κ²?? ? ??΄μ§? λ²νΈλ₯? ?΄λ¦??? ? URL
  public String makeSearch(int page){
    
    UriComponents uriComponents=
                UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("perPageNum", cri.getPerPageNum())
                .queryParam("searchKey", ((ShoppingMallSearchVO)cri).getSearchKey())
                .build(); 
    
    return uriComponents.toUriString();
  } 
  
//??°λ§? ? ??΄μ§? λ²νΈλ₯? ?΄λ¦??? ? URL
  public String makeFilter(int page) {
	  	
	  	//?€???Όκ³? ??΄??? λ¦¬μ€?Έ ??λ‘? κ°?μ§?κ³? ??Όλ―?λ‘? String?Όλ‘? ???΄? ?¨μ£ΌκΈ° ??΄ λ§λ  λ³??
	    String styleParam="";
	    String ageParam="";
	    
	    //λ°°μ΄?Έ ?€???Όκ³? ??΄??λ₯? μ²λ¦¬?΄μ£ΌκΈ° ?? forλ¬? 
	    //style=λͺ¨λ??¬&style=?¬?λ² μ΄μ§? ??λ‘? λ§λ€κΈ? ??΄? ? λ²μ§Έ λ°°μ΄ κ°λ??° &λ₯? μ§μ  ?£?΄μ€??€
		if (((SpmFilterVO) cri).getStyle()!=null) {
			for (int i = 0; i < ((SpmFilterVO) cri).getStyle().length; i++) {
				if (i == 0) { //μ²? λ²μ§Έ λ°°μ΄ κ°μ? &style? ?΄μ£Όμ? ??? style=λͺ¨λ??¬ ??λ‘? ?€?΄κ°?
					styleParam =((SpmFilterVO) cri).getStyle()[i];
				} else {
					styleParam = styleParam + "&style=" + ((SpmFilterVO) cri).getStyle()[i];
				}
			}
		}
		//age μ²λ¦¬ λΆ?λΆ?
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
		
		//style?΄? age??° μ‘°κ±΄?΄ ?? κ²½μ° ??¬κ°? λ°μ?λ―?λ‘? κ°? ??©? λ§λ ifλ¬? μ²λ¦¬
		if(styleParam=="" || ageParam=="") {
			//styleκ³? age??° μ‘°κ±΄ λͺ¨λ ?? κ²½μ°
			if(styleParam=="" && ageParam=="") {
			    uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .build(); 
			  //style??° μ‘°κ±΄ ?? κ²½μ°
			} else if(styleParam=="") {
	    		uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("age", ageParam)
		                .build();
	    	  //age??° μ‘°κ±΄ ?? κ²½μ°
			} else if(ageParam=="") {
				uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("style", styleParam)
		                .build(); 
			}
		//??° μ‘°κ±΄ λͺ¨λ ?? κ²½μ°
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
