package o00O0ooo;

import o00O0OO0.OooOOOO;
import o00O0Oo.o00Oo0;

/* loaded from: classes3.dex */
public final class o0O00oO0 implements o0OoOoOo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ o0OoOoOo f31701OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f31702OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O00oO0(o0OoOoOo o0oooooo, o00Oo0 o00oo0) {
        this.f31701OooOo0O = o0oooooo;
        this.f31702OooOo0o = (OooOOOO) o00oo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [o00O0OO0.OooOOOO, o00O0Oo.o00Oo0] */
    /* JADX WARN: Type inference failed for: r9v6, types: [o00O0OO0.OooOOOO, o00O0Oo.o00Oo0] */
    @Override // o00O0ooo.o0OoOoOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(o00O0ooo.o0O000Oo r9, o00O0O0O.OooO0OO r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o00O0ooo.o0O00o00
            if (r0 == 0) goto L13
            r0 = r10
            o00O0ooo.o0O00o00 r0 = (o00O0ooo.o0O00o00) r0
            int r1 = r0.f31698OooOo0o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31698OooOo0o = r1
            goto L18
        L13:
            o00O0ooo.o0O00o00 r0 = new o00O0ooo.o0O00o00
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f31697OooOo0O
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31698OooOo0o
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f31700OooOoO0
            o00O.o0ooOOo r9 = (o00O.o0ooOOo) r9
            o00O0.o000OOo.OooOO0O(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f31700OooOoO0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            o00O0.o000OOo.OooOO0O(r10)
            goto La0
        L44:
            o00O0ooo.o0O000Oo r9 = r0.f31699OooOoO
            java.lang.Object r2 = r0.f31700OooOoO0
            o00O0ooo.o0O00oO0 r2 = (o00O0ooo.o0O00oO0) r2
            o00O0.o000OOo.OooOO0O(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            o00O0.o000OOo.OooOO0O(r10)
            o00O0ooo.o0OoOoOo r10 = r8.f31701OooOo0O     // Catch: java.lang.Throwable -> L8a
            r0.f31700OooOoO0 = r8     // Catch: java.lang.Throwable -> L8a
            r0.f31699OooOoO = r9     // Catch: java.lang.Throwable -> L8a
            r0.f31698OooOo0o = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            o00O.o0ooOOo r10 = new o00O.o0ooOOo
            o00O0O0O.OooOOO0 r4 = r0.getContext()
            r10.<init>(r9, r4)
            o00O0OO0.OooOOOO r9 = r2.f31702OooOo0o     // Catch: java.lang.Throwable -> L82
            r0.f31700OooOoO0 = r10     // Catch: java.lang.Throwable -> L82
            r0.f31699OooOoO = r6     // Catch: java.lang.Throwable -> L82
            r0.f31698OooOo0o = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            oo00o.OooOo r9 = oo00o.OooOo.f33195OooO00o
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            o00O0ooo.oO000O0O r10 = new o00O0ooo.oO000O0O
            r10.<init>(r9)
            o00O0OO0.OooOOOO r2 = r2.f31702OooOo0o
            r0.f31700OooOoO0 = r9
            r0.f31699OooOoO = r6
            r0.f31698OooOo0o = r4
            java.lang.Object r10 = o00O0ooo.o0o0000.OooO0o0(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.o0O00oO0.collect(o00O0ooo.o0O000Oo, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
