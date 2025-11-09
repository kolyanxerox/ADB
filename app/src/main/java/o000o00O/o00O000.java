package o000o00o;

import android.util.Log;
import java.io.Serializable;
import o00O0O0O.OooO0OO;
import o00O0ooo.o0O000Oo;

/* loaded from: classes2.dex */
public final class o00O000 extends o00O0OO0.OooOOOO implements o00O0Oo.o00Oo0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ o0O000Oo f30829OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30830OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f30831OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f30832OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Serializable f30833OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o00O0O00 o00o0o00, OooO0OO oooO0OO) {
        super(3, oooO0OO);
        this.f30832OooOoO = o00o0o00;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [o00O0OO0.OooOOOO, o00O0Oo.o00Oo0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // o00O0Oo.o00Oo0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o0O000Oo o0o000oo = (o0O000Oo) obj;
        switch (this.f30830OooOo0O) {
            case 0:
                o00O000 o00o000 = new o00O000((o00O0O00) this.f30832OooOoO, (OooO0OO) obj3);
                o00o000.f30829OooOo = o0o000oo;
                o00o000.f30833OooOoO0 = (Throwable) obj2;
                return o00o000.invokeSuspend(oo00o.OooOo.f33195OooO00o);
            default:
                o00O000 o00o0002 = new o00O000((o00O0Oo.o00Oo0) this.f30832OooOoO, (OooO0OO) obj3);
                o00o0002.f30829OooOo = o0o000oo;
                o00o0002.f30833OooOoO0 = (Object[]) obj2;
                return o00o0002.invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [o00O0OO0.OooOOOO, o00O0Oo.o00Oo0] */
    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o0O000Oo o0o000oo;
        switch (this.f30830OooOo0O) {
            case 0:
                o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
                int i = this.f30831OooOo0o;
                if (i == 0) {
                    o00O0.o000OOo.OooOO0O(obj);
                    o0O000Oo o0o000oo2 = this.f30829OooOo;
                    Throwable th = (Throwable) this.f30833OooOoO0;
                    o000O0 o000o0OooO00o = ((o00O0O00) this.f30832OooOoO).f30851OooO0O0.OooO00o(null);
                    o000O0o o000o0o2 = new o000O0o(o000o0OooO00o, null, null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + o000o0OooO00o.f30778OooO00o);
                    this.f30829OooOo = null;
                    this.f30831OooOo0o = 1;
                    if (o0o000oo2.emit(o000o0o2, this) == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o00O0.o000OOo.OooOO0O(obj);
                }
                return oo00o.OooOo.f33195OooO00o;
            default:
                o00O0O0o.OooOo00 oooOo002 = o00O0O0o.OooOo00.f31365OooOo0O;
                int i2 = this.f30831OooOo0o;
                if (i2 == 0) {
                    o00O0.o000OOo.OooOO0O(obj);
                    o0o000oo = this.f30829OooOo;
                    Object[] objArr = (Object[]) this.f30833OooOoO0;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f30829OooOo = o0o000oo;
                    this.f30831OooOo0o = 1;
                    obj = ((o00O0OO0.OooOOOO) this.f30832OooOoO).invoke(obj2, obj3, this);
                    if (obj == oooOo002) {
                        return oooOo002;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o00O0.o000OOo.OooOO0O(obj);
                        return oo00o.OooOo.f33195OooO00o;
                    }
                    o0o000oo = this.f30829OooOo;
                    o00O0.o000OOo.OooOO0O(obj);
                }
                this.f30829OooOo = null;
                this.f30831OooOo0o = 2;
                if (o0o000oo.emit(obj, this) == oooOo002) {
                    return oooOo002;
                }
                return oo00o.OooOo.f33195OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O000(o00O0Oo.o00Oo0 o00oo0, OooO0OO oooO0OO) {
        super(3, oooO0OO);
        this.f30832OooOoO = (o00O0OO0.OooOOOO) o00oo0;
    }
}
