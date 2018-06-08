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

  private int displayPageNum = 5; //?™”ë©´ì— ë³´ì—¬ì§??Š” ?˜?´ì§? ë²ˆí˜¸?˜ ?ˆ˜

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
  
  //ê²??ƒ‰ ?›„ ?˜?´ì§? ë²ˆí˜¸ë¥? ?´ë¦??–ˆ?„ ?•Œ URL
  public String makeSearch(int page){
    
    UriComponents uriComponents=
                UriComponentsBuilder.newInstance()
                .queryParam("page", page)
                .queryParam("perPageNum", cri.getPerPageNum())
                .queryParam("searchKey", ((ShoppingMallSearchVO)cri).getSearchKey())
                .build(); 
    
    return uriComponents.toUriString();
  } 
  
//?•„?„°ë§? ?›„ ?˜?´ì§? ë²ˆí˜¸ë¥? ?´ë¦??–ˆ?„ ?•Œ URL
  public String makeFilter(int page) {
	  	
	  	//?Š¤???¼ê³? ?‚˜?´???Š” ë¦¬ìŠ¤?Š¸ ?˜•?ƒœë¡? ê°?ì§?ê³? ?ˆ?œ¼ë¯?ë¡? String?œ¼ë¡? ???–´?„œ ?¨ì£¼ê¸° ?œ„?•´ ë§Œë“  ë³??ˆ˜
	    String styleParam="";
	    String ageParam="";
	    
	    //ë°°ì—´?¸ ?Š¤???¼ê³? ?‚˜?´??ë¥? ì²˜ë¦¬?•´ì£¼ê¸° ?œ„?•œ forë¬? 
	    //style=ëª¨ë˜?‹œ?¬&style=?‹¬?”Œë² ì´ì§? ?˜•?ƒœë¡? ë§Œë“¤ê¸? ?œ„?•´?„œ ?‘ ë²ˆì§¸ ë°°ì—´ ê°’ë??„° &ë¥? ì§ì ‘ ?„£?–´ì¤??‹¤
		if (((SpmFilterVO) cri).getStyle()!=null) {
			for (int i = 0; i < ((SpmFilterVO) cri).getStyle().length; i++) {
				if (i == 0) { //ì²? ë²ˆì§¸ ë°°ì—´ ê°’ì? &style?„ ?•´ì£¼ì? ?•Š?•„?„ style=ëª¨ë˜?‹œ?¬ ?˜•?ƒœë¡? ?“¤?–´ê°?
					styleParam =((SpmFilterVO) cri).getStyle()[i];
				} else {
					styleParam = styleParam + "&style=" + ((SpmFilterVO) cri).getStyle()[i];
				}
			}
		}
		//age ì²˜ë¦¬ ë¶?ë¶?
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
		
		//style?´?‚˜ age?•„?„° ì¡°ê±´?´ ?—†?„ ê²½ìš° ?—?Ÿ¬ê°? ë°œìƒ?•˜ë¯?ë¡? ê°? ?ƒ?™©?— ë§ëŠ” ifë¬? ì²˜ë¦¬
		if(styleParam=="" || ageParam=="") {
			//styleê³? age?•„?„° ì¡°ê±´ ëª¨ë‘ ?—†?„ ê²½ìš°
			if(styleParam=="" && ageParam=="") {
			    uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .build(); 
			  //style?•„?„° ì¡°ê±´ ?—†?„ ê²½ìš°
			} else if(styleParam=="") {
	    		uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("age", ageParam)
		                .build();
	    	  //age?•„?„° ì¡°ê±´ ?—†?„ ê²½ìš°
			} else if(ageParam=="") {
				uriComponents=
		                UriComponentsBuilder.newInstance()
		                .queryParam("page", page)
		                .queryParam("perPageNum", cri.getPerPageNum())
		                .queryParam("category", ((SpmFilterVO)cri).getCategory())
		                .queryParam("style", styleParam)
		                .build(); 
			}
		//?•„?„° ì¡°ê±´ ëª¨ë‘ ?ˆ?„ ê²½ìš°
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
