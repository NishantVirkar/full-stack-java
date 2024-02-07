package com.myproject;

public class Appliances {
		private int productId;
		private String productName;
		private double price;
		private double GST;
		private int Stock;
		
		public void setProductId(int productId) {
			this.productId=productId;
		}
		
		public int getProductId() {
			return productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getGST() {
			return GST;
		}

		public void setGST(double GST) {
			this.GST = GST;
		}
		
		public void setStock(int Stock) {
			this.Stock=Stock;
		}
		
		public int getStock() {
			return Stock;
		}

		

	}



