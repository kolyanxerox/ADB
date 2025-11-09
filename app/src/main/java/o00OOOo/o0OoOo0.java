package o00OOoo;

import o00O0Oo.OooO0O0;

/* loaded from: classes3.dex */
public final class o0OoOo0 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f32636OooOo0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(ClassLoader classLoader) {
        super(0);
        this.f32636OooOo0O = classLoader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0281, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0289, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0100, code lost:
    
        r0 = r12.readShortLe() & 65535;
        r7 = r12.readShortLe() & 65535;
        r9 = r12.readShortLe() & 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0122, code lost:
    
        if (r9 != (r12.readShortLe() & 65535)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0124, code lost:
    
        if (r0 != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0126, code lost:
    
        if (r7 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
    
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        r12.skip(4);
        r23 = r12.readIntLe() & io.flutter.embedding.android.KeyboardMap.kValueMask;
        r32 = r12.readShortLe() & 65535;
        r20 = new com.google.android.gms.internal.ads.OooOO0O(r9, r23, r32);
        r12.readUtf8(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0150, code lost:
    
        r12.close();
        r14 = r14 - 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0159, code lost:
    
        if (r14 <= r18) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015b, code lost:
    
        r6 = o00Oo0oo.o00oO0o.OooO00o(r13.OooO0OO(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016a, code lost:
    
        if (r6.readIntLe() != 117853008) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016c, code lost:
    
        r7 = r6.readIntLe();
        r9 = r6.readLongLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0179, code lost:
    
        if (r6.readIntLe() != 1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017b, code lost:
    
        if (r7 != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x017d, code lost:
    
        r7 = o00Oo0oo.o00oO0o.OooO00o(r13.OooO0OO(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0185, code lost:
    
        r9 = r7.readIntLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018c, code lost:
    
        if (r9 != 101075792) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018e, code lost:
    
        r7.skip(12);
        r9 = r7.readIntLe();
        r10 = r7.readIntLe();
        r28 = r7.readLongLe();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a5, code lost:
    
        if (r28 != r7.readLongLe()) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a7, code lost:
    
        if (r9 != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a9, code lost:
    
        if (r10 != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ab, code lost:
    
        r7.skip(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01be, code lost:
    
        r20 = new com.google.android.gms.internal.ads.OooOO0O(r28, r7.readLongLe(), r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f1, code lost:
    
        throw new java.io.IOException("bad zip: expected " + o00OOoo.Oooo000.OooO0OO(101075792) + " but was " + o00OOoo.Oooo000.OooO0OO(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0201, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0206, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x020d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0211, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0216, code lost:
    
        r6 = r0.f16809OooO0O0;
        r1 = new java.util.ArrayList();
        r9 = o00Oo0oo.o00oO0o.OooO00o(r13.OooO0OO(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0225, code lost:
    
        r14 = r0.f16808OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0229, code lost:
    
        if (r18 >= r14) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022b, code lost:
    
        r0 = o00OOoo.Oooo000.OooO0Oo(r9);
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0235, code lost:
    
        if (r0.f32628OooO0oO >= r20) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0237, code lost:
    
        r6 = o00OOoo.o00O0O.f32620OooO0OO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023f, code lost:
    
        if (OoooOOO.C0001o0.OooO0oo(r0.f32622OooO00o) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0241, code lost:
    
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0245, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0248, code lost:
    
        r18 = r18 + 1;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0256, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0257, code lost:
    
        r9.close();
        r1 = new o00OOOoO.o00O000o(r8, r11, o00OOoo.Oooo000.OooO0O0(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0263, code lost:
    
        r13.close();
        r6 = new oo00o.OooOO0(r1, o00OOoo.o00O0O.f32620OooO0OO);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x027c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x027d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Finally extract failed */
    @Override // o00O0Oo.OooO0O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOoo.o0OoOo0.invoke():java.lang.Object");
    }
}
