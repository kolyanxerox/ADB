package com.unity3d.services.core.network.domain;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0.OooOo00;
import o00O0Oo.o00O0O;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class CleanupDirectory$invoke$additionalFiles$2 extends Oooo000 implements o00O0O {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    public CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    @Override // o00O0Oo.o00O0O
    public final OooOO0 invoke(OooOO0 oooOO0, File file) {
        OooOo.OooO0o0(oooOO0, "<name for destructuring parameter 0>");
        OooOo.OooO0o0(file, "file");
        return new OooOO0(Long.valueOf(((Number) oooOO0.f33185OooOo0O).longValue() - file.length()), OooOo00.Oooo00o((List) oooOO0.f33186OooOo0o, file));
    }
}
