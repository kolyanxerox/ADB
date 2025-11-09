package com.applovin.shadow.okio.internal;

import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes2.dex */
public final class ResourceFileSystem$toJarRoot$zip$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    public static final ResourceFileSystem$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$toJarRoot$zip$1();

    public ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    @Override // o00O0Oo.Oooo000
    public final Boolean invoke(ZipEntry entry) {
        OooOo.OooO0o0(entry, "entry");
        return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(entry.getCanonicalPath()));
    }
}
