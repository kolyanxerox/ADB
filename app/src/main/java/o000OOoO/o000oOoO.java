package o000OooO;

import android.util.Log;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.internal.ads.OooOO0O;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import o000Oooo.o000000;
import o000Oooo.o0000O0;
import o000Oooo.o0000oo;
import o000Oooo.o000OOo;
import org.apache.tika.pipes.PipesClient;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000oOoO implements Callable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f30541OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f30542OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f30543OooOo0o;

    public /* synthetic */ o000oOoO(int i, Object obj, Object obj2) {
        this.f30542OooOo0O = i;
        this.f30543OooOo0o = obj;
        this.f30541OooOo = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f30542OooOo0O) {
            case 0:
                o00O0O o00o0o = (o00O0O) this.f30543OooOo0o;
                Oooo0 oooo0 = (Oooo0) this.f30541OooOo;
                o0000oo o0000ooVar = o00o0o.f30552OooO0oo;
                HashMap map = oooo0.f30540OooO00o;
                synchronized (o0000ooVar.f30637OooO0o0) {
                    try {
                        HashMap mapOooO0O0 = o0000ooVar.OooO0O0();
                        boolean z = false;
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            if (str.length() <= 250 && (str2 == null || str2.length() <= 500)) {
                                boolean z2 = true;
                                if (str2 != null) {
                                    z |= !Objects.equals(mapOooO0O0.put(str, str2), str2);
                                } else {
                                    if (mapOooO0O0.remove(str) == null) {
                                        z2 = false;
                                    }
                                    z |= z2;
                                }
                            }
                            Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", Integer.valueOf(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION), Integer.valueOf(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE)));
                            return null;
                            break;
                        }
                        if (!z) {
                            return null;
                        }
                        if (mapOooO0O0.size() > 100) {
                            Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100));
                            return null;
                        }
                        o0000ooVar.f30633OooO00o.edit().putString("customSignals", new JSONObject(mapOooO0O0).toString()).commit();
                        Log.d("FirebaseRemoteConfig", "Keys of updated custom signals: " + o0000ooVar.OooO0O0().keySet());
                        return null;
                    } finally {
                    }
                }
            case 1:
                o00O0O o00o0o2 = (o00O0O) this.f30543OooOo0o;
                OooOO0O oooOO0O = (OooOO0O) this.f30541OooOo;
                o0000oo o0000ooVar2 = o00o0o2.f30552OooO0oo;
                synchronized (o0000ooVar2.f30634OooO0O0) {
                    o0000ooVar2.f30633OooO00o.edit().putLong("fetch_timeout_in_seconds", oooOO0O.f16808OooO00o).putLong("minimum_fetch_interval_in_seconds", oooOO0O.f16809OooO0O0).commit();
                }
                return null;
            case 2:
                o000OOo o000ooo2 = (o000OOo) this.f30543OooOo0o;
                o000000 o000000Var = (o000000) this.f30541OooOo;
                o0000O0 o0000o02 = o000ooo2.f30643OooO0O0;
                synchronized (o0000o02) {
                    FileOutputStream fileOutputStreamOpenFileOutput = o0000o02.f30623OooO00o.openFileOutput(o0000o02.f30624OooO0O0, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(o000000Var.f30593OooO00o.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            default:
                return ((PipesClient) this.f30543OooOo0o).lambda$restart$1((o00Oo00o.o0OoOo0) this.f30541OooOo);
        }
    }
}
