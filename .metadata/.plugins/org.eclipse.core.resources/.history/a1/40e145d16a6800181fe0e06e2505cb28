package stylecode.kosta180.product.domain;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class ProductPageMaker {

	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;

	private int displayPageNum = 5; // �솕硫댁뿉 蹂댁뿬吏��뒗 �럹�씠吏� 踰덊샇�쓽 �닔

	private ProductCriteria cri;

	public void setCri(ProductCriteria cri) {
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

	public ProductCriteria getCri() {
		return cri;
	}

	public String makeQuery(int page) {

		UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParam("page", page)
				.queryParam("perPageNum", cri.getPerPageNum()).build();

		return uriComponents.toUriString();
	}

	public String makeSearch(int page) {

		UriComponents uriComponents = UriComponentsBuilder.newInstance().queryParam("page", page)
				.queryParam("perPageNum", cri.getPerPageNum())
				.queryParam("searchKey", ((ProductSearchVO) cri).getSearchKey()).build();

		return uriComponents.toUriString();
	}

	private String encoding(String searchKey) {
		if (searchKey == null || searchKey.trim().length() == 0) {
			return "";
		}
		try {
			return URLEncoder.encode(searchKey, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}
