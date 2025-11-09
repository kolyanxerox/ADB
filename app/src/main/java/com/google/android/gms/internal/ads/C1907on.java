package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.on */
/* loaded from: classes2.dex */
public final class C1907on extends AbstractC1869nn {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final Set f23008OooOoOO = Collections.synchronizedSet(new HashSet());

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final DecimalFormat f23009OooOoo0 = new DecimalFormat("#,###");

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f23010OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public File f23011OooOoO0;

    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    public final void OooOO0() {
        this.f23010OooOoO = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c2  */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.a7] */
    @Override // com.google.android.gms.internal.ads.AbstractC1869nn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOo0(java.lang.String r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1907on.OooOOo0(java.lang.String):boolean");
    }

    public final File OooOo00(File file) {
        return new File(new File(this.f23011OooOoO0, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
