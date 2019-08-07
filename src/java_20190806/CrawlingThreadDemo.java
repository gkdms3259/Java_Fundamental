package java_20190806;

public class CrawlingThreadDemo {
	public static void main(String[] args) {
		
		CrawlingThread c1 = new CrawlingThread("bitcoin","bitcoin.xls");
		CrawlingThread c2 = new CrawlingThread("etherum","etherum.xls");
		CrawlingThread c3 = new CrawlingThread("ripple","ripple.xls");
		CrawlingThread c4 = new CrawlingThread("bitcoin-cash","bitcoin-cash.xls");
		CrawlingThread c5 = new CrawlingThread("litecoin","litecoin.xls");
		CrawlingThread c6 = new CrawlingThread("binance-coin","binance-coin.xls");
		CrawlingThread c7 = new CrawlingThread("eos","eos.xls");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		c7.start();
	
	}

}
