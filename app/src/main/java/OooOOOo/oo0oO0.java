package OoooOOO;

import Oooo.OooOo00;
import Oooo00O.o000000O;
import androidx.collection.LruCache;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oo0oO0 extends LruCache {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OO00o0 f14912OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(o0OO00o0 o0oo00o0) {
        super(20);
        Objects.requireNonNull(o0oo00o0);
        this.f14912OooO00o = o0oo00o0;
    }

    @Override // androidx.collection.LruCache
    public final Object create(Object obj) throws Throwable {
        String str = (String) obj;
        o000000O.OooO0o0(str);
        o0OO00o0 o0oo00o0 = this.f14912OooO00o;
        o0oo00o0.OooOO0o();
        o000000O.OooO0o0(str);
        o00OO0OO o00oo0oo = o0oo00o0.f14916OooOo0o.f14792OooOo;
        oOO0000.OoooOO0(o00oo0oo);
        OooOo00 oooOo00O00ooo = o00oo0oo.o00ooo(str);
        if (oooOo00O00ooo == null) {
            return null;
        }
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) o0oo00o0.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0OO(str, "Populate EES config from database on cache miss. appId");
        o0oo00o0.OooOOoo(str, o0oo00o0.OooOo00(str, (byte[]) oooOo00O00ooo.f13712OooOo0o));
        return (com.google.android.gms.internal.measurement.o000000O) o0oo00o0.f14493OooOooo.snapshot().get(str);
    }
}
