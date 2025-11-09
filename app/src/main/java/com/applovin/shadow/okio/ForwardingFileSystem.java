package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0OO00O;
import o00O0.o0OoOo0;
import o00O0Oo0.o00Oo0;

/* loaded from: classes2.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    /* renamed from: com.applovin.shadow.okio.ForwardingFileSystem$listRecursively$1 */
    public static final class C13541 extends Oooo000 implements o00O0Oo.Oooo000 {
        public C13541() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public final Path invoke(Path it) {
            OooOo.OooO0o0(it, "it");
            return ForwardingFileSystem.this.onPathResult(it, "listRecursively");
        }
    }

    public ForwardingFileSystem(FileSystem delegate) {
        OooOo.OooO0o0(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z) throws IOException {
        OooOo.OooO0o0(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), z);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        OooOo.OooO0o0(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", "target"));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z) throws IOException {
        OooOo.OooO0o0(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        o0OoOo0.OooOo0O(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        OooOo.OooO0o0(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        o0OoOo0.OooOo0O(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public o00O0o.Oooo000 listRecursively(Path dir, boolean z) {
        OooOo.OooO0o0(dir, "dir");
        o00O0o.Oooo000 oooo000ListRecursively = this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z);
        C13541 c13541 = new C13541();
        OooOo.OooO0o0(oooo000ListRecursively, "<this>");
        return new o00Oo0(oooo000ListRecursively, c13541, 4);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        OooOo.OooO0o0(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String functionName, String parameterName) {
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(functionName, "functionName");
        OooOo.OooO0o0(parameterName, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String functionName) {
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(functionName, "functionName");
        return path;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        OooOo.OooO0o0(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z, boolean z2) throws IOException {
        OooOo.OooO0o0(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), z, z2);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z) throws IOException {
        OooOo.OooO0o0(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", "file"), z);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws IOException {
        OooOo.OooO0o0(file, "file");
        return this.delegate.source(onPathParameter(file, "source", "file"));
    }

    public String toString() {
        return o0OO00O.OooO00o(getClass()).OooO0OO() + '(' + this.delegate + ')';
    }
}
