package com.applovin.shadow.okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import kotlin.jvm.internal.OooOo;

/* renamed from: com.applovin.shadow.okio.-DeprecatedOkio, reason: invalid class name */
/* loaded from: classes2.dex */
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    private DeprecatedOkio() {
    }

    public final Sink appendingSink(File file) {
        OooOo.OooO0o0(file, "file");
        return Okio.appendingSink(file);
    }

    public final Sink blackhole() {
        return Okio.blackhole();
    }

    public final BufferedSink buffer(Sink sink) {
        OooOo.OooO0o0(sink, "sink");
        return Okio.buffer(sink);
    }

    public final Sink sink(File file) {
        OooOo.OooO0o0(file, "file");
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    public final Source source(File file) {
        OooOo.OooO0o0(file, "file");
        return Okio.source(file);
    }

    public final BufferedSource buffer(Source source) {
        OooOo.OooO0o0(source, "source");
        return Okio.buffer(source);
    }

    public final Sink sink(OutputStream outputStream) {
        OooOo.OooO0o0(outputStream, "outputStream");
        return Okio.sink(outputStream);
    }

    public final Source source(InputStream inputStream) {
        OooOo.OooO0o0(inputStream, "inputStream");
        return Okio.source(inputStream);
    }

    public final Sink sink(java.nio.file.Path path, OpenOption... options) {
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(options, "options");
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    public final Source source(java.nio.file.Path path, OpenOption... options) {
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(options, "options");
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    public final Sink sink(Socket socket) {
        OooOo.OooO0o0(socket, "socket");
        return Okio.sink(socket);
    }

    public final Source source(Socket socket) {
        OooOo.OooO0o0(socket, "socket");
        return Okio.source(socket);
    }
}
