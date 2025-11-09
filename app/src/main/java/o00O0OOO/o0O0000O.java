package o00O0ooo;

import o00O.OooOOO0;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oo.o0000oo;

/* loaded from: classes3.dex */
public final class o0O0000O extends OooOOO0 {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final OooOOOO f31670OooOoOO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0000O(o00O0O o00o0o, o00O0O0O.OooOOO0 oooOOO0, int i, o0000oo o0000ooVar) {
        super(o00o0o, oooOOO0, i, o0000ooVar);
        this.f31670OooOoOO = (OooOOOO) o00o0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o00O.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0Oo(o00O0oo.o00oOoo r5, o00O0O0O.OooO0OO r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o00O0ooo.o0O00000
            if (r0 == 0) goto L13
            r0 = r6
            o00O0ooo.o0O00000 r0 = (o00O0ooo.o0O00000) r0
            int r1 = r0.f31669OooOoO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31669OooOoO0 = r1
            goto L1a
        L13:
            o00O0ooo.o0O00000 r0 = new o00O0ooo.o0O00000
            o00O0OO0.OooO0OO r6 = (o00O0OO0.OooO0OO) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f31668OooOo0o
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31669OooOoO0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            o00O0oo.o00oOoo r5 = r0.f31667OooOo0O
            o00O0.o000OOo.OooOO0O(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            o00O0.o000OOo.OooOO0O(r6)
            r0.f31667OooOo0O = r5
            r0.f31669OooOoO0 = r3
            java.lang.Object r6 = super.OooO0Oo(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            o00O0oo.o0O0ooO r5 = (o00O0oo.o0O0ooO) r5
            o00O0oo.o000O000 r5 = r5.f31651OooOoO0
            boolean r5 = r5.OooOoO0()
            if (r5 == 0) goto L4e
            oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
            return r5
        L4e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.o0O0000O.OooO0Oo(o00O0oo.o00oOoo, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o00O0OO0.OooOOOO, o00O0Oo.o00O0O] */
    @Override // o00O.OooOOO0
    public final OooOOO0 OooO0o0(o00O0O0O.OooOOO0 oooOOO0, int i, o0000oo o0000ooVar) {
        return new o0O0000O(this.f31670OooOoOO, oooOOO0, i, o0000ooVar);
    }
}
