package OooOOoo;

import OoooO0O.o00oOoo;
import android.os.Handler;
import android.os.Looper;
import o000000O.OooOO0;
import o000o0O0.OooOOO0;

/* loaded from: classes2.dex */
public final class o0000OO0 implements o0000O, o00oOoo, OooOOO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public static o0000OO0 f13529OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f13530OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f13531OooOo0o;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f13530OooOo0O = i;
        this.f13531OooOo0o = obj;
    }

    public static o0000OO0 OooO00o(Object obj) {
        if (obj != null) {
            return new o0000OO0(obj, 3);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // o00O00oO.o0000O0
    public Object get() {
        switch (this.f13530OooOo0O) {
        }
        return this.f13531OooOo0o;
    }

    @Override // OoooO0O.o00O000
    public Object zza() {
        return this.f13531OooOo0o;
    }

    public o0000OO0() {
        this.f13530OooOo0O = 2;
        this.f13531OooOo0o = new Object();
        new Handler(Looper.getMainLooper(), new OooOO0(this));
    }
}
