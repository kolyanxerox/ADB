package OoooOOO;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class oO000 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f14602OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0OoO f14603OooOo0o;

    public /* synthetic */ oO000(oO0O0OoO oo0o0ooo, int i) {
        this.f14602OooOo0O = i;
        this.f14603OooOo0o = oo0o0ooo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14602OooOo0O) {
            case 0:
                this.f14603OooOo0o.Oooo00o();
                break;
            case 1:
                o0OO000o o0oo000o = this.f14603OooOo0o.f14740Oooo0o;
                o0OO0oO0 o0oo0oo0 = o0oo000o.f14484OooOo0o;
                o0OO0o00 o0oo0o00 = o0oo0oo0.f14522OooOoo0;
                o0OO0oO0.OooOOO0(o0oo0o00);
                o0oo0o00.OooOO0O();
                if (o0oo000o.OooO0o0()) {
                    boolean zOooO0Oo = o0oo000o.OooO0Oo();
                    oO0O0OoO oo0o0ooo = o0oo0oo0.f14529Oooo00o;
                    o0O o0o = o0oo0oo0.f14518OooOoO;
                    if (zOooO0Oo) {
                        o0OO0oO0.OooOO0O(o0o);
                        o0o.f14203OoooO0.OooO0o0(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        o0OO0oO0.OooOO0o(oo0o0ooo);
                        oo0o0ooo.OooOOo("auto", bundle, "_cmpx");
                    } else {
                        o0OO0oO0.OooOO0O(o0o);
                        o0O0oo00 o0o0oo00 = o0o.f14203OoooO0;
                        String strOooO0Oo = o0o0oo00.OooO0Oo();
                        if (TextUtils.isEmpty(strOooO0Oo)) {
                            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
                            o0OO0oO0.OooOOO0(o0o0o0o0);
                            o0o0o0o0.f14395OooOoo0.OooO0O0("Cache still valid but referrer not found");
                        } else {
                            long jOooO00o = o0o.f14205OoooO0O.OooO00o() / 3600000;
                            Uri uri = Uri.parse(strOooO0Oo);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jOooO00o - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            o0OO0oO0.OooOO0o(oo0o0ooo);
                            oo0o0ooo.OooOOo(str2, (Bundle) pair.second, "_cmp");
                        }
                        o0o0oo00.OooO0o0(null);
                    }
                    o0OO0oO0.OooOO0O(o0o);
                    o0o.f14205OoooO0O.OooO0O0(0L);
                    break;
                }
                break;
            case 2:
                oO0O0OoO oo0o0ooo2 = this.f14603OooOo0o;
                oo0o0ooo2.OooOO0O();
                o0OO0oO0 o0oo0oo02 = (o0OO0oO0) oo0o0ooo2.f14574OooOo0O;
                o0O o0o2 = o0oo0oo02.f14518OooOoO;
                o0OO0oO0.OooOO0O(o0o2);
                boolean zOooO00o = o0o2.f14201Oooo0oo.OooO00o();
                o0O0O0o0 o0o0o0o02 = o0oo0oo02.f14520OooOoOO;
                if (zOooO00o) {
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14401Oooo00o.OooO0O0("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    o0O o0o3 = o0oo0oo02.f14518OooOoO;
                    o0OO0oO0.OooOO0O(o0o3);
                    o0O0o0 o0o0o0 = o0o3.f14191Oooo;
                    long jOooO00o2 = o0o0o0.OooO00o();
                    o0o0o0.OooO0O0(1 + jOooO00o2);
                    if (jOooO00o2 >= 5) {
                        o0OO0oO0.OooOOO0(o0o0o0o02);
                        o0o0o0o02.f14396OooOooO.OooO0O0("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        o0o3.f14201Oooo0oo.OooO0O0(true);
                        break;
                    } else {
                        if (oo0o0ooo2.f14743Oooo0oo == null) {
                            oo0o0ooo2.f14743Oooo0oo = new oO000O0(oo0o0ooo2, o0oo0oo02, 3);
                        }
                        oo0o0ooo2.f14743Oooo0oo.OooO0O0(0L);
                        break;
                    }
                }
            default:
                this.f14603OooOo0o.Oooo00o();
                break;
        }
    }

    public oO000(oO0O0OoO oo0o0ooo) {
        this.f14602OooOo0O = 1;
        Objects.requireNonNull(oo0o0ooo);
        this.f14603OooOo0o = oo0o0ooo;
    }
}
