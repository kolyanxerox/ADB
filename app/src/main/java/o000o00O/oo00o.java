package o000o00o;

import o00O0O0O.OooO0OO;

/* loaded from: classes2.dex */
public final class oo00o extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo */
    public final /* synthetic */ o000O0o f30894OooOo;

    /* renamed from: OooOo0O */
    public int f30895OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o00O0O00 f30896OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(o00O0O00 o00o0o00, o000O0o o000o0o2, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30896OooOo0o = o00o0o00;
        this.f30894OooOo = o000o0o2;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new oo00o(this.f30896OooOo0o, this.f30894OooOo, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((oo00o) create((o00O0oOo.o000OO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0031, code lost:
    
        if (r8.updateData(r1, r7) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        if (o000o00o.o00O0O00.OooO00o(r5, r1.f30778OooO00o, r8, r7) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0081, code lost:
    
        return r0;
     */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r7.f30895OooOo0O
            r2 = 0
            r3 = 2
            r4 = 1
            o000o00o.o00O0O00 r5 = r7.f30896OooOo0o
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            o00O0.o000OOo.OooOO0O(r8)
            goto L82
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            o00O0.o000OOo.OooOO0O(r8)     // Catch: java.lang.Exception -> L1f
            goto L82
        L1f:
            r8 = move-exception
            goto L34
        L21:
            o00O0.o000OOo.OooOO0O(r8)
            androidx.datastore.core.DataStore r8 = r5.f30855OooO0o0     // Catch: java.lang.Exception -> L1f
            o000o00o.o00O00o0 r1 = new o000o00o.o00O00o0     // Catch: java.lang.Exception -> L1f
            r1.<init>(r5, r2)     // Catch: java.lang.Exception -> L1f
            r7.f30895OooOo0O = r4     // Catch: java.lang.Exception -> L1f
            java.lang.Object r8 = r8.updateData(r1, r7)     // Catch: java.lang.Exception -> L1f
            if (r8 != r0) goto L82
            goto L81
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "App foregrounded, failed to update data. Message: "
            r1.<init>(r4)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "FirebaseSessions"
            android.util.Log.d(r1, r8)
            o000o00o.o000O0o r8 = r7.f30894OooOo
            boolean r1 = r5.OooO0Oo(r8)
            if (r1 == 0) goto L82
            o000o00o.o00O0000 r1 = r5.f30851OooO0O0
            o000o00o.o000O0 r4 = r8.f30786OooO00o
            o000o00o.o000O0 r1 = r1.OooO00o(r4)
            r4 = 4
            o000o00o.o000O0o r8 = o000o00o.o000O0o.OooO00o(r8, r1, r2, r2, r4)
            r5.f30857OooO0oo = r8
            o000o00o.o000O0O0 r8 = r5.f30852OooO0OO
            o000o00o.o000OOo0 r8 = (o000o00o.o000OOo0) r8
            o00O0O0O.OooOOO0 r4 = r8.f30805OooO0o0
            o00OO000.OooO0OO r4 = o00O0oOo.o0000OO0.OooO0O0(r4)
            o000o00o.o000O r6 = new o000o00o.o000O
            r6.<init>(r8, r1, r2)
            r8 = 3
            o00O0oOo.o0000OO0.OooOo0(r4, r2, r6, r8)
            o000o00o.o00O00O r8 = o000o00o.o00O00O.f30840OooOo0o
            r7.f30895OooOo0O = r3
            java.lang.String r1 = r1.f30778OooO00o
            java.lang.Object r8 = o000o00o.o00O0O00.OooO00o(r5, r1, r8, r7)
            if (r8 != r0) goto L82
        L81:
            return r0
        L82:
            oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o00o.oo00o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
