package com.applovin.shadow.okio.internal;

import java.util.List;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import oo00o.OooOO0;

/* loaded from: classes2.dex */
public final class ResourceFileSystem$roots$2 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ ResourceFileSystem this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceFileSystem$roots$2(ResourceFileSystem resourceFileSystem) {
        super(0);
        this.this$0 = resourceFileSystem;
    }

    @Override // o00O0Oo.OooO0O0
    public final List<OooOO0> invoke() {
        ResourceFileSystem resourceFileSystem = this.this$0;
        return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
    }
}
