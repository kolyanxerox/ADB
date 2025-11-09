package androidx.webkit.internal;

import OooO0oO.OooOOO0;
import OooOOOo.o0ooOOo;
import Oooo.OooOo00;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import o000Ooo.o0OOO0o;
import o000OooO.o00O0O;
import o000OooO.o0OO00O;
import o000Oooo.o000000;
import o000Oooo.o0000O0;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Callable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15329OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f15330OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f15329OooOo0O = i;
        this.f15330OooOo0o = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        o000000 o000000VarOooO00o;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        switch (this.f15329OooOo0O) {
            case 0:
                return JavaScriptReplyProxyImpl.lambda$forInvocationHandler$0((JsReplyProxyBoundaryInterface) this.f15330OooOo0o);
            case 1:
                return WebViewRenderProcessImpl.lambda$forInvocationHandler$0((WebViewRendererBoundaryInterface) this.f15330OooOo0o);
            case 2:
                o0ooOOo o0ooooo = (o0ooOOo) ((OooOOO0) this.f15330OooOo0o).f13278OooOo;
                o000O0O0.OooO oooO = (o000O0O0.OooO) o0ooooo.f13432OooO0OO;
                o000O0O0.OooO0O0 oooO0O0 = (o000O0O0.OooO0O0) o0ooooo.f13436OooO0oO;
                String str = oooO0O0.f30118OooO0O0;
                o000O0O.OooO.OooO0O0();
                try {
                    HashMap mapOooO0O0 = o000O0O0.OooO0O0.OooO0O0(oooO);
                    OooOo00 oooOo00 = new OooOo00(str, mapOooO0O0);
                    oooOo00.OooOOOO("User-Agent", "Crashlytics Android SDK/20.0.0");
                    oooOo00.OooOOOO("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    o000O0O0.OooO0O0.OooO00o(oooOo00, oooO);
                    String str2 = "Requesting settings from " + str;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    String str3 = "Settings query params were: " + mapOooO0O0;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return oooO0O0.OooO0OO(oooOo00.OooOO0O());
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e);
                    return null;
                }
            case 3:
                o0OOO0o o0ooo0o = ((o000Ooo.o000000) this.f15330OooOo0o).f30440OooO0oo;
                o0ooo0o.getClass();
                o000O0O.OooO.OooO00o();
                o000Oo0O.OooOo00 oooOo002 = o0ooo0o.f30500OooO0OO;
                String str4 = (String) oooOo002.f30372OooOo0o;
                o000O0Oo.OooO0o oooO0o = (o000O0Oo.OooO0o) oooOo002.f30370OooOo;
                oooO0o.getClass();
                boolean z = true;
                if (new File((File) oooO0o.f30140OooOoO0, str4).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    String str5 = (String) oooOo002.f30372OooOo0o;
                    oooO0o.getClass();
                    new File((File) oooO0o.f30140OooOoO0, str5).delete();
                } else {
                    String strOooO0o0 = o0ooo0o.OooO0o0();
                    if (strOooO0o0 == null || !o0ooo0o.f30506OooOO0.OooO0OO(strOooO0o0)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return ((o00O0O) this.f15330OooOo0o).OooO0OO();
            case 5:
                return ((o0OO00O) this.f15330OooOo0o).OooO00o();
            case 6:
                o0000O0 o0000o02 = (o0000O0) this.f15330OooOo0o;
                synchronized (o0000o02) {
                    o000000VarOooO00o = null;
                    try {
                        fileInputStreamOpenFileInput = o0000o02.f30623OooO00o.openFileInput(o0000o02.f30624OooO0O0);
                        try {
                            int iAvailable = fileInputStreamOpenFileInput.available();
                            byte[] bArr = new byte[iAvailable];
                            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                            o000000VarOooO00o = o000000.OooO00o(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStreamOpenFileInput.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            return o000000VarOooO00o;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th3) {
                        fileInputStreamOpenFileInput = null;
                        th = th3;
                    }
                }
                return o000000VarOooO00o;
            default:
                return ((AsyncProcessor) this.f15330OooOo0o).lambda$new$0();
        }
    }
}
