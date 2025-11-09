package o000o00o;

import o00O0O0O.OooO0OO;

/* loaded from: classes2.dex */
public final class o0ooOOo extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo */
    public final /* synthetic */ o00oOoo f30886OooOo;

    /* renamed from: OooOo0O */
    public int f30887OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o0OOO0o f30888OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(o0OOO0o o0ooo0o, o00oOoo o00oooo, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30888OooOo0o = o0ooo0o;
        this.f30886OooOo = o00oooo;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o0ooOOo(this.f30888OooOo0o, this.f30886OooOo, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o0ooOOo) create((o00O0oOo.o000OO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x005d, code lost:
    
        if (r7.OooO0O0(r6) == r0) goto L66;
     */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r6.f30887OooOo0O
            r2 = 1
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            o000o00o.o0OOO0o r5 = r6.f30888OooOo0o
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1c
            if (r1 != r4) goto L14
            o00O0.o000OOo.OooOO0O(r7)
            goto L60
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            o00O0.o000OOo.OooOO0O(r7)
            goto L2e
        L20:
            o00O0.o000OOo.OooOO0O(r7)
            oooo00o.o000O0 r7 = oooo00o.o000O0.f33293OooO00o
            r6.f30887OooOo0O = r2
            java.lang.Object r7 = r7.OooO0O0(r6)
            if (r7 != r0) goto L2e
            goto L5f
        L2e:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            if (r7 == 0) goto L3d
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L3d
            goto L9b
        L3d:
            java.util.Iterator r7 = r7.iterator()
        L41:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r7.next()
            o000Ooo.o00Ooo r1 = (o000Ooo.o00Ooo) r1
            o000Ooo.o00000O0 r1 = r1.f30484OooO00o
            boolean r1 = r1.OooO0O0()
            if (r1 == 0) goto L41
            o000o0O.oo000o r7 = r5.f30879OooO0O0
            r6.f30887OooOo0O = r4
            java.lang.Object r7 = r7.OooO0O0(r6)
            if (r7 != r0) goto L60
        L5f:
            return r0
        L60:
            o000o0O.oo000o r7 = r5.f30879OooO0O0
            o000o0O.o0O0O00 r0 = r7.f30945OooO00o
            java.lang.Boolean r0 = r0.OooO00o()
            if (r0 == 0) goto L6f
            boolean r2 = r0.booleanValue()
            goto L7b
        L6f:
            o000o0O.o0O0O00 r7 = r7.f30946OooO0O0
            java.lang.Boolean r7 = r7.OooO00o()
            if (r7 == 0) goto L7b
            boolean r2 = r7.booleanValue()
        L7b:
            if (r2 != 0) goto L89
            java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r3, r7)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            goto La6
        L89:
            o000o00o.o00oO0o r7 = new o000o00o.o00oO0o
            o000o00o.o00oOoo r0 = r6.f30886OooOo
            r7.<init>(r0)
            o0000o0.Oooo0 r0 = r5.f30878OooO00o
            r0.OooO00o()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f29596OooOO0
            r0.add(r7)
            goto La6
        L9b:
            java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
            int r7 = android.util.Log.d(r3, r7)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
        La6:
            oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o00o.o0ooOOo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
