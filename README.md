LibraryDialog
=============

Library Dialog For Android

public void dialogQuit() {
		DialogApplication dialogApp = new DialogApplication(mContext);
		dialogApp.open("Konfirmasi", "Keluar Aplikasi ?", new OnDialog(){

			@Override
			public void onYes() {
				// TODO Auto-generated method stub
				removeChatNotification();
				keepScreen(false);
				if(server!=null) server.stop();
				settings.saveString("examActive", "");
				finish();
				System.exit(0);
			}

			@Override
			public void onNo() {
				// TODO Auto-generated method stub
				
			}
			
		});
    }