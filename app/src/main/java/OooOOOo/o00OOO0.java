package OoooOOO;

import Oooo00O.o000000O;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o00OOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f14163OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f14164OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f14165OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f14166OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o00OOOO0 f14167OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f14168OooO0o0;

    public o00OOO0(o0OO0oO0 o0oo0oo0, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        o00OOOO0 o00oooo0;
        o000000O.OooO0o0(str2);
        o000000O.OooO0o0(str3);
        this.f14163OooO00o = str2;
        this.f14164OooO0O0 = str3;
        this.f14165OooO0OO = true == TextUtils.isEmpty(str) ? null : str;
        this.f14166OooO0Oo = j;
        this.f14168OooO0o0 = j2;
        if (j2 != 0 && j2 > j) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(o0O0O0o0.OooOOoo(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            o00oooo0 = new o00OOOO0(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    o0O0O0o0 o0o0o0o02 = o0oo0oo0.f14520OooOoOO;
                    o0OO0oO0.OooOOO0(o0o0o0o02);
                    o0o0o0o02.f14393OooOoOO.OooO0O0("Param name can't be null");
                    it.remove();
                } else {
                    oOO00OO ooo00oo = o0oo0oo0.f14523OooOooO;
                    o0OO0oO0.OooOO0O(ooo00oo);
                    Object objOooOOo = ooo00oo.OooOOo(bundle2.get(next), next);
                    if (objOooOOo == null) {
                        o0O0O0o0 o0o0o0o03 = o0oo0oo0.f14520OooOoOO;
                        o0OO0oO0.OooOOO0(o0o0o0o03);
                        o0o0o0o03.f14396OooOooO.OooO0OO(o0oo0oo0.f14524OooOooo.OooO0O0(next), "Param value can't be null");
                        it.remove();
                    } else {
                        oOO00OO ooo00oo2 = o0oo0oo0.f14523OooOooO;
                        o0OO0oO0.OooOO0O(ooo00oo2);
                        ooo00oo2.OooOoO(next, objOooOOo, bundle2);
                    }
                }
            }
            o00oooo0 = new o00OOOO0(bundle2);
        }
        this.f14167OooO0o = o00oooo0;
    }

    public final o00OOO0 OooO00o(o0OO0oO0 o0oo0oo0, long j) {
        return new o00OOO0(o0oo0oo0, this.f14165OooO0OO, this.f14163OooO00o, this.f14164OooO0O0, this.f14166OooO0Oo, j, this.f14167OooO0o);
    }

    public final String toString() {
        String string = this.f14167OooO0o.toString();
        String str = this.f14163OooO00o;
        int length = String.valueOf(str).length();
        String str2 = this.f14164OooO0O0;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        OooO00o.OooOooO(sb, "Event{appId='", str, "', name='", str2);
        return OooO00o.OooOOO0(sb, "', params=", string, "}");
    }

    public o00OOO0(o0OO0oO0 o0oo0oo0, String str, String str2, String str3, long j, long j2, o00OOOO0 o00oooo0) {
        o000000O.OooO0o0(str2);
        o000000O.OooO0o0(str3);
        o000000O.OooO0oo(o00oooo0);
        this.f14163OooO00o = str2;
        this.f14164OooO0O0 = str3;
        this.f14165OooO0OO = true == TextUtils.isEmpty(str) ? null : str;
        this.f14166OooO0Oo = j;
        this.f14168OooO0o0 = j2;
        if (j2 != 0 && j2 > j) {
            o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0Oo(o0O0O0o0.OooOOoo(str2), "Event created with reverse previous/current timestamps. appId, name", o0O0O0o0.OooOOoo(str3));
        }
        this.f14167OooO0o = o00oooo0;
    }
}
