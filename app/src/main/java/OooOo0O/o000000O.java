package OoooO0O;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000000O implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13912OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f13913OooOo0o;

    public /* synthetic */ o000000O(o0000Ooo o0000ooo, int i) {
        this.f13912OooOo0O = i;
        this.f13913OooOo0o = o0000ooo;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String strConcat;
        switch (this.f13912OooOo0O) {
            case 0:
                o0000Ooo o0000ooo = this.f13913OooOo0o;
                o0000ooo.getClass();
                o0000ooo.f13946OooOoO0.execute(new o000000O(o0000ooo, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                o0000Ooo o0000ooo2 = this.f13913OooOo0o;
                Application application = o0000ooo2.f13943OooOo0O;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    if (applicationIcon == null) {
                        strConcat = null;
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", strConcat);
                    JSONObject jSONObject2 = new JSONObject();
                    o0OOO0o o0ooo0o = o0000ooo2.f13948OooOoo;
                    for (String str : o0ooo0o.OooO00o().keySet()) {
                        jSONObject2.put(str, o0ooo0o.OooO00o().get(str));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                o0000ooo2.f13949OooOoo0.f14072OooO0oO.OooO00o("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}
