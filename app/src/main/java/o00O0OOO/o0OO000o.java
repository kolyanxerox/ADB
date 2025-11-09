package o00O0ooo;

import kotlin.jvm.internal.o0Oo0oo;
import o00O.OooO00o;
import o00O0O0O.OooO0OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o0OO000o implements o0O000Oo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31754OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f31755OooOo0o;

    public /* synthetic */ o0OO000o(o0Oo0oo o0oo0oo, int i) {
        this.f31754OooOo0O = i;
        this.f31755OooOo0o = o0oo0oo;
    }

    @Override // o00O0ooo.o0O000Oo
    public final Object emit(Object obj, OooO0OO oooO0OO) {
        switch (this.f31754OooOo0O) {
            case 0:
                this.f31755OooOo0o.f28880OooOo0O = obj;
                throw new OooO00o(this);
            case 1:
                this.f31755OooOo0o.f28880OooOo0O = obj;
                throw new OooO00o(this);
            default:
                o0Oo0oo o0oo0oo = this.f31755OooOo0o;
                if (o0oo0oo.f28880OooOo0O != o00O.OooO0OO.f31171OooO0O0) {
                    throw new IllegalArgumentException("Flow has more than one element");
                }
                o0oo0oo.f28880OooOo0O = obj;
                return OooOo.f33195OooO00o;
        }
    }
}
