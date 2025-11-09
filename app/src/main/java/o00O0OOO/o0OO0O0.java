package o00O0ooo;

import o00O0O0O.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o0OO0O0 extends OooOOOO implements o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0OOo000 f31765OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31766OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo f31767OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(o0OoOoOo o0oooooo, o0OOo000 o0ooo000, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31767OooOo0o = o0oooooo;
        this.f31765OooOo = o0ooo000;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o0OO0O0(this.f31767OooOo0o, this.f31765OooOo, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0OO0O0) create((o000OO) obj, (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[RETURN] */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r7.f31766OooOo0O
            oo00o.OooOo r2 = oo00o.OooOo.f33195OooO00o
            o00O0ooo.o0OOo000 r3 = r7.f31765OooOo
            r4 = 1
            o00O0ooo.o0OoOoOo r5 = r7.f31767OooOo0o
            if (r1 == 0) goto L38
            if (r1 == r4) goto L34
            r4 = 3
            r6 = 2
            if (r1 == r6) goto L28
            if (r1 == r4) goto L24
            r0 = 4
            if (r1 != r0) goto L1c
            o00O0.o000OOo.OooOO0O(r8)
            return r2
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            o00O0.o000OOo.OooOO0O(r8)
            return r2
        L28:
            o00O0.o000OOo.OooOO0O(r8)
            r7.f31766OooOo0O = r4
            java.lang.Object r8 = r5.collect(r3, r7)
            if (r8 != r0) goto L44
            goto L43
        L34:
            o00O0.o000OOo.OooOO0O(r8)
            return r2
        L38:
            o00O0.o000OOo.OooOO0O(r8)
            r7.f31766OooOo0O = r4
            java.lang.Object r8 = r5.collect(r3, r7)
            if (r8 != r0) goto L44
        L43:
            return r0
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.o0OO0O0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
