package stylecode.kosta180.userrecommend.domain;

import java.util.List;

public class RateCommand {
	private List<ProductRateVO> productRates;

	public List<ProductRateVO> getProductRates() {
		return productRates;
	}

	public void setProductRates(List<ProductRateVO> productRates) {
		this.productRates = productRates;
	}

	@Override
	public String toString() {
		return "RateCommand [productRates=" + productRates + "]";
	}
	

}