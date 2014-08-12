/*
 * Created by Wianto Wie 
 * Join Facebook group https://www.facebook.com/groups/AplikasiAndroidIndonesia/
 */
package id.ianplater.library.dialog;

import id.ianplater.library.dialog.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DialogApplication{
	//private static final String TAG = "DialogApplication";
	Context mContext;
	Dialog dialog;
	public DialogApplication(Context context) {
		mContext	= context;
	}

	public void open(String title, String text, final OnDialog onDialog) {
			dialog = new Dialog(mContext,R.style.DialogCenterAnim);
			dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
			dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
			dialog.setContentView(R.layout.dialog_form);
			final TextView dialogTitle = (TextView) dialog.findViewById(R.id.dialogTitle);
			final TextView dialogText  = (TextView) dialog.findViewById(R.id.dialogText);
			Button buttonYes 	= (Button) dialog.findViewById(R.id.buttonYes);
			Button buttonNo		= (Button) dialog.findViewById(R.id.buttonNo);
			
			dialogTitle.setText(title);
			dialogText.setText(text);
			
			buttonYes.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					dialog.dismiss();
					onDialog.onYes();
				}
			});
			
			buttonNo.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					dialog.dismiss();
					onDialog.onNo();
				}
			});
			
			dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
				@Override
				public void onCancel(DialogInterface dialogInterface) {
					onDialog.onNo();
					
				}
			});
			dialog.show();
	}
}