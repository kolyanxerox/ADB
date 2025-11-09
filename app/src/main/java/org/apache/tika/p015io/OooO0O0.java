package org.apache.tika.p015io;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0O0 implements Closeable, AutoCloseable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ Path f33310OooOo0O;

    public /* synthetic */ OooO0O0(Path path) {
        this.f33310OooOo0O = path;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        TemporaryResources.lambda$createTempFile$0(this.f33310OooOo0O);
    }
}
