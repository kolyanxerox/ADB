package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o00O0.o0OoOo0;

/* loaded from: classes2.dex */
public class JvmSystemFileSystem extends FileSystem {
    private final void requireCreate(Path path) throws IOException {
        if (exists(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    private final void requireExist(Path path) throws IOException {
        if (exists(path)) {
            return;
        }
        throw new IOException(path + " doesn't exist.");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z) throws IOException {
        OooOo.OooO0o0(file, "file");
        if (z) {
            requireExist(file);
        }
        return Okio.sink(file.toFile(), true);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        OooOo.OooO0o0(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (canonicalFile.exists()) {
            return Path.Companion.get$default(Path.Companion, canonicalFile, false, 1, (Object) null);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
        if (fileMetadataMetadataOrNull == null || !fileMetadataMetadataOrNull.isDirectory()) {
            throw new IOException(androidx.datastore.preferences.protobuf.OooO00o.OooO(dir, "failed to create directory: "));
        }
        if (z) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(target, "target");
        throw new IOException("unsupported");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z) throws IOException {
        OooOo.OooO0o0(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException(androidx.datastore.preferences.protobuf.OooO00o.OooO(path, "failed to delete "));
        }
        if (z) {
            throw new FileNotFoundException(androidx.datastore.preferences.protobuf.OooO00o.OooO(path, "no such file: "));
        }
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        List<Path> list = list(dir, true);
        OooOo.OooO0O0(list);
        return list;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        OooOo.OooO0o0(dir, "dir");
        return list(dir, false);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        OooOo.OooO0o0(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        OooOo.OooO0o0(file, "file");
        return new JvmFileHandle(false, new RandomAccessFile(file.toFile(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z, boolean z2) throws IOException {
        OooOo.OooO0o0(file, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z) {
            requireCreate(file);
        }
        if (z2) {
            requireExist(file);
        }
        return new JvmFileHandle(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z) throws IOException {
        OooOo.OooO0o0(file, "file");
        if (z) {
            requireCreate(file);
        }
        return Okio__JvmOkioKt.sink$default(file.toFile(), false, 1, null);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) {
        OooOo.OooO0o0(file, "file");
        return Okio.source(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    private final List<Path> list(Path path, boolean z) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (file.exists()) {
                throw new IOException(androidx.datastore.preferences.protobuf.OooO00o.OooO(path, "failed to list "));
            }
            throw new FileNotFoundException(androidx.datastore.preferences.protobuf.OooO00o.OooO(path, "no such file: "));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            OooOo.OooO0O0(str);
            arrayList.add(path.resolve(str));
        }
        o0OoOo0.OooOo0O(arrayList);
        return arrayList;
    }
}
