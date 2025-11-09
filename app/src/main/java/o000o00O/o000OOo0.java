package o000o00o;

/* loaded from: classes2.dex */
public final class o000OOo0 implements o000O0O0 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final double f30799OooO0o = Math.random();

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f30800OooO0oO = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0000o0.Oooo0 f30801OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o000Oo0O.Oooo0 f30802OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000o0O.oo000o f30803OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo0 f30804OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0O0O.OooOOO0 f30805OooO0o0;

    public o000OOo0(o0000o0.Oooo0 firebaseApp, o000Oo0O.Oooo0 firebaseInstallations, o000o0O.oo000o sessionSettings, o00Oo0 eventGDTLogger, o00O0O0O.OooOOO0 backgroundDispatcher) {
        kotlin.jvm.internal.OooOo.OooO0o0(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.OooOo.OooO0o0(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.OooOo.OooO0o0(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.OooOo.OooO0o0(backgroundDispatcher, "backgroundDispatcher");
        this.f30801OooO00o = firebaseApp;
        this.f30802OooO0O0 = firebaseInstallations;
        this.f30803OooO0OO = sessionSettings;
        this.f30804OooO0Oo = eventGDTLogger;
        this.f30805OooO0o0 = backgroundDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r7.OooO0O0(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object OooO00o(o000o00o.o000OOo0 r6, o00O0OO0.OooO0OO r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof o000o00o.o000OO00
            if (r0 == 0) goto L16
            r0 = r7
            o000o00o.o000OO00 r0 = (o000o00o.o000OO00) r0
            int r1 = r0.f30794OooOoO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f30794OooOoO0 = r1
            goto L1b
        L16:
            o000o00o.o000OO00 r0 = new o000o00o.o000OO00
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f30793OooOo0o
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f30794OooOoO0
            r3 = 1
            r4 = 2
            java.lang.String r5 = "FirebaseSessions"
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            o000o00o.o000OOo0 r6 = r0.f30792OooOo0O
            o00O0.o000OOo.OooOO0O(r7)
            goto L83
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            o000o00o.o000OOo0 r6 = r0.f30792OooOo0O
            o00O0.o000OOo.OooOO0O(r7)
            goto L4f
        L3f:
            o00O0.o000OOo.OooOO0O(r7)
            oooo00o.o000O0 r7 = oooo00o.o000O0.f33293OooO00o
            r0.f30792OooOo0O = r6
            r0.f30794OooOoO0 = r3
            java.lang.Object r7 = r7.OooO0O0(r0)
            if (r7 != r1) goto L4f
            goto L82
        L4f:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            if (r7 == 0) goto L5e
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L5e
            goto Lbf
        L5e:
            java.util.Iterator r7 = r7.iterator()
        L62:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lbf
            java.lang.Object r2 = r7.next()
            o000Ooo.o00Ooo r2 = (o000Ooo.o00Ooo) r2
            o000Ooo.o00000O0 r2 = r2.f30484OooO00o
            boolean r2 = r2.OooO0O0()
            if (r2 == 0) goto L62
            o000o0O.oo000o r7 = r6.f30803OooO0OO
            r0.f30792OooOo0O = r6
            r0.f30794OooOoO0 = r4
            java.lang.Object r7 = r7.OooO0O0(r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            o000o0O.oo000o r7 = r6.f30803OooO0OO
            o000o0O.o0O0O00 r0 = r7.f30945OooO00o
            java.lang.Boolean r0 = r0.OooO00o()
            if (r0 == 0) goto L92
            boolean r3 = r0.booleanValue()
            goto L9e
        L92:
            o000o0O.o0O0O00 r7 = r7.f30946OooO0O0
            java.lang.Boolean r7 = r7.OooO00o()
            if (r7 == 0) goto L9e
            boolean r3 = r7.booleanValue()
        L9e:
            if (r3 != 0) goto La8
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        La8:
            o000o0O.oo000o r6 = r6.f30803OooO0OO
            double r6 = r6.OooO00o()
            double r0 = o000o00o.o000OOo0.f30799OooO0o
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lb7
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lb7:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lbf:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r5, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o000o00o.o000OOo0.OooO00o(o000o00o.o000OOo0, o00O0OO0.OooO0OO):java.lang.Object");
    }
}
