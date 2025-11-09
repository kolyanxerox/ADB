package o00O0ooo;

import o00O0O0O.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo.o00Oo0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class o0OO000 extends OooOOOO implements o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo f31750OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f31751OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f31752OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f31753OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OO000(o0OoOoOo o0oooooo, o00Oo0 o00oo0, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f31750OooOo = o0oooooo;
        this.f31753OooOoO0 = (OooOOOO) o00oo0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o00O0OO0.OooOOOO, o00O0Oo.o00Oo0] */
    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        o0OO000 o0oo000 = new o0OO000(this.f31750OooOo, this.f31753OooOoO0, oooO0OO);
        o0oo000.f31752OooOo0o = obj;
        return o0oo000;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0OO000) create((o0O000Oo) obj, (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [o00O0OO0.OooOOOO, o00O0Oo.o00Oo0] */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r5.f31751OooOo0O
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.f31752OooOo0o
            o00O0ooo.o0O r0 = (o00O0ooo.o0O) r0
            o00O0.o000OOo.OooOO0O(r6)     // Catch: o00O.OooO00o -> L11
            goto L3c
        L11:
            r6 = move-exception
            goto L38
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            o00O0.o000OOo.OooOO0O(r6)
            java.lang.Object r6 = r5.f31752OooOo0o
            o00O0ooo.o0O000Oo r6 = (o00O0ooo.o0O000Oo) r6
            o00O0ooo.o0OoOoOo r1 = r5.f31750OooOo
            o00O0ooo.o0O r3 = new o00O0ooo.o0O
            o00O0OO0.OooOOOO r4 = r5.f31753OooOoO0
            r3.<init>(r4, r6)
            r5.f31752OooOo0o = r3     // Catch: o00O.OooO00o -> L36
            r5.f31751OooOo0O = r2     // Catch: o00O.OooO00o -> L36
            java.lang.Object r6 = r1.collect(r3, r5)     // Catch: o00O.OooO00o -> L36
            if (r6 != r0) goto L3c
            return r0
        L36:
            r6 = move-exception
            r0 = r3
        L38:
            java.lang.Object r1 = r6.f31166OooOo0O
            if (r1 != r0) goto L3f
        L3c:
            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
            return r6
        L3f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.o0OO000.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
