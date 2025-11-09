package o00O0o;

import java.util.Iterator;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public final class o00Ooo extends o00O0OO0.OooOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31424OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Object f31425OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Iterator f31426OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ oo00o.OooOO0 f31427OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f31428OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o00O0Oo0.o00Oo0 f31429OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o00O0Oo.o00O0O f31430OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(oo00o.OooOO0 oooOO0, o00O0Oo0.o00Oo0 o00oo0, o00O0Oo.o00O0O o00o0o, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31427OooOoO = oooOO0;
        this.f31429OooOoOO = o00oo0;
        this.f31430OooOoo0 = o00o0o;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        o00Ooo o00ooo2 = new o00Ooo(this.f31427OooOoO, this.f31429OooOoOO, this.f31430OooOoo0, oooO0OO);
        o00ooo2.f31428OooOoO0 = obj;
        return o00ooo2;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o00Ooo) create((o000oOoO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        o000oOoO o000oooo2 = (o000oOoO) this.f31428OooOoO0;
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f31424OooOo;
        Object obj2 = this.f31427OooOoO;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            this.f31428OooOoO0 = o000oooo2;
            this.f31424OooOo = 1;
            o000oooo2.OooO00o(obj2, this);
            return oooOo00;
        }
        if (i == 1) {
            o000OOo.OooOO0O(obj);
            it = this.f31429OooOoOO.iterator();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f31426OooOo0o;
            obj2 = this.f31425OooOo0O;
            o000OOo.OooOO0O(obj);
        }
        if (!it.hasNext()) {
            return oo00o.OooOo.f33195OooO00o;
        }
        Object objInvoke = this.f31430OooOoo0.invoke(obj2, it.next());
        this.f31428OooOoO0 = o000oooo2;
        this.f31425OooOo0O = objInvoke;
        this.f31426OooOo0o = it;
        this.f31424OooOo = 2;
        o000oooo2.OooO00o(objInvoke, this);
        return oooOo00;
    }
}
