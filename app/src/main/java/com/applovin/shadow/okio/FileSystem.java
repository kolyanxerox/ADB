package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes2.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            OooOo.OooO0o0(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* renamed from: -write$default */
    public static /* synthetic */ Object m13689write$default(FileSystem fileSystem, Path file, boolean z, Oooo000 writerAction, int i, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        OooOo.OooO0o0(file, "file");
        OooOo.OooO0o0(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z));
        Throwable th = null;
        try {
            objInvoke = writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    o0OO0O0.OooO00o(th3, th4);
                }
            }
            objInvoke = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        OooOo.OooO0O0(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        OooOo.OooO0Oo(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        OooOo.OooO0Oo(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.appendingSink(path, z);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectories(path, z);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.createDirectory(path, z);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.delete(path, z);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fileSystem.deleteRecursively(path, z);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ o00O0o.Oooo000 listRecursively$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.listRecursively(path, z);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return fileSystem.openReadWrite(path, z, z2);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fileSystem.sink(path, z);
    }

    /* renamed from: -read */
    public final <T> T m13690read(Path file, Oooo000 readerAction) throws Throwable {
        T t;
        OooOo.OooO0o0(file, "file");
        OooOo.OooO0o0(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        Throwable th = null;
        try {
            t = (T) readerAction.invoke(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    o0OO0O0.OooO00o(th3, th4);
                }
            }
            th = th3;
            t = null;
        }
        if (th != null) {
            throw th;
        }
        OooOo.OooO0O0(t);
        return t;
    }

    /* renamed from: -write */
    public final <T> T m13691write(Path file, boolean z, Oooo000 writerAction) throws Throwable {
        T t;
        OooOo.OooO0o0(file, "file");
        OooOo.OooO0o0(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z));
        Throwable th = null;
        try {
            t = (T) writerAction.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    o0OO0O0.OooO00o(th3, th4);
                }
            }
            t = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        OooOo.OooO0O0(t);
        return t;
    }

    public final Sink appendingSink(Path file) throws IOException {
        OooOo.OooO0o0(file, "file");
        return appendingSink(file, false);
    }

    public abstract Sink appendingSink(Path path, boolean z) throws IOException;

    public abstract void atomicMove(Path path, Path path2) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public void copy(Path source, Path target) throws IOException {
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(target, "target");
        com.applovin.shadow.okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(Path dir, boolean z) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        com.applovin.shadow.okio.internal.FileSystem.commonCreateDirectories(this, dir, z);
    }

    public final void createDirectory(Path dir) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(Path path, boolean z) throws IOException;

    public abstract void createSymlink(Path path, Path path2) throws IOException;

    public final void delete(Path path) throws IOException {
        OooOo.OooO0o0(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z) throws IOException;

    public void deleteRecursively(Path fileOrDirectory, boolean z) throws IOException {
        OooOo.OooO0o0(fileOrDirectory, "fileOrDirectory");
        com.applovin.shadow.okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, z);
    }

    public final boolean exists(Path path) throws IOException {
        OooOo.OooO0o0(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path path) throws IOException;

    public abstract List<Path> listOrNull(Path path);

    public o00O0o.Oooo000 listRecursively(Path dir, boolean z) {
        OooOo.OooO0o0(dir, "dir");
        return com.applovin.shadow.okio.internal.FileSystem.commonListRecursively(this, dir, z);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        OooOo.OooO0o0(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path path) throws IOException;

    public final FileHandle openReadWrite(Path file) throws IOException {
        OooOo.OooO0o0(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z, boolean z2) throws IOException;

    public final Sink sink(Path file) throws IOException {
        OooOo.OooO0o0(file, "file");
        return sink(file, false);
    }

    public abstract Sink sink(Path path, boolean z) throws IOException;

    public abstract Source source(Path path) throws IOException;

    public final void createDirectories(Path dir) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        createDirectories(dir, false);
    }

    public final void deleteRecursively(Path fileOrDirectory) throws IOException {
        OooOo.OooO0o0(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final o00O0o.Oooo000 listRecursively(Path dir) {
        OooOo.OooO0o0(dir, "dir");
        return listRecursively(dir, false);
    }
}
