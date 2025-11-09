package o00O;

import java.util.concurrent.atomic.AtomicInteger;
import o00O0oOo.o000OO;
import o00O0oo.o000O000;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes3.dex */
public final class OooOo extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f31188OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31189OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo[] f31190OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o000O000 f31191OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f31192OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(o0OoOoOo[] o0ooooooArr, int i, AtomicInteger atomicInteger, o000O000 o000o0002, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31190OooOo0o = o0ooooooArr;
        this.f31188OooOo = i;
        this.f31192OooOoO0 = atomicInteger;
        this.f31191OooOoO = o000o0002;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        return new OooOo(this.f31190OooOo0o, this.f31188OooOo, this.f31192OooOoO0, this.f31191OooOoO, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((OooOo) create((o000OO) obj, (o00O0O0O.OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f31189OooOo0O;
        AtomicInteger atomicInteger = this.f31192OooOoO0;
        o000O000 o000o0002 = this.f31191OooOoO;
        try {
            if (i == 0) {
                o00O0.o000OOo.OooOO0O(obj);
                o0OoOoOo[] o0ooooooArr = this.f31190OooOo0o;
                int i2 = this.f31188OooOo;
                o0OoOoOo o0oooooo = o0ooooooArr[i2];
                OooOo00 oooOo002 = new OooOo00(o000o0002, i2);
                this.f31189OooOo0O = 1;
                if (o0oooooo.collect(oooOo002, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00O0.o000OOo.OooOO0O(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                o000o0002.OooOOO(null);
            }
            return oo00o.OooOo.f33195OooO00o;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                o000o0002.OooOOO(null);
            }
        }
    }
}
