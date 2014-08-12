LibraryDialog
=============

Library Dialog For Android

#### 1. How to Use
``` java
	public void dialogQuit() {
		DialogApplication dialogApp = new DialogApplication(mContext);
		dialogApp.open("Konfirmasi", "Keluar Aplikasi ?", new OnDialog(){

			@Override
			public void onYes() {
				// TODO Auto-generated method stub
				finish();
				System.exit(0);
			}

			@Override
			public void onNo() {
				// TODO Auto-generated method stub
				
			}
			
		});
    }
```