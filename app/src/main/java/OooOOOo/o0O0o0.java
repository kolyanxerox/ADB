package OoooOOO;

import Oooo00O.o000000O;
import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0O0o0 {

    /* renamed from: OooO00o */
    public final String f14414OooO00o;

    /* renamed from: OooO0O0 */
    public final long f14415OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f14416OooO0OO;

    /* renamed from: OooO0Oo */
    public long f14417OooO0Oo;

    /* renamed from: OooO0o0 */
    public final /* synthetic */ o0O f14418OooO0o0;

    public o0O0o0(o0O o0o, String str, long j) {
        Objects.requireNonNull(o0o);
        this.f14418OooO0o0 = o0o;
        o000000O.OooO0o0(str);
        this.f14414OooO00o = str;
        this.f14415OooO0O0 = j;
    }

    public final long OooO00o() {
        if (!this.f14416OooO0OO) {
            this.f14416OooO0OO = true;
            this.f14417OooO0Oo = this.f14418OooO0o0.OooOOOO().getLong(this.f14414OooO00o, this.f14415OooO0O0);
        }
        return this.f14417OooO0Oo;
    }

    public final void OooO0O0(long j) {
        SharedPreferences.Editor editorEdit = this.f14418OooO0o0.OooOOOO().edit();
        editorEdit.putLong(this.f14414OooO00o, j);
        editorEdit.apply();
        this.f14417OooO0Oo = j;
    }
}
