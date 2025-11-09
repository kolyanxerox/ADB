package OoooOOO;

import Oooo00O.o000000O;
import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0O0o00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f14462OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f14463OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f14464OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f14465OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O f14466OooO0o0;

    public o0O0o00O(o0O o0o, String str, boolean z) {
        Objects.requireNonNull(o0o);
        this.f14466OooO0o0 = o0o;
        o000000O.OooO0o0(str);
        this.f14462OooO00o = str;
        this.f14463OooO0O0 = z;
    }

    public final boolean OooO00o() {
        if (!this.f14464OooO0OO) {
            this.f14464OooO0OO = true;
            this.f14465OooO0Oo = this.f14466OooO0o0.OooOOOO().getBoolean(this.f14462OooO00o, this.f14463OooO0O0);
        }
        return this.f14465OooO0Oo;
    }

    public final void OooO0O0(boolean z) {
        SharedPreferences.Editor editorEdit = this.f14466OooO0o0.OooOOOO().edit();
        editorEdit.putBoolean(this.f14462OooO00o, z);
        editorEdit.apply();
        this.f14465OooO0Oo = z;
    }
}
