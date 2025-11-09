package com.applovin.shadow.okio.internal;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0.Oooo000;
import o00O0.o00O0O;
import o00O0oO.o000000;
import o00O0oO.o0000O00;
import oo00o.OooO0OO;
import oo00o.OooOO0;

/* loaded from: classes2.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final OooO0OO roots$delegate;
    private final FileSystem systemFileSystem;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !o0000O00.OooOooo(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            OooOo.OooO0o0(path, "<this>");
            OooOo.OooO0o0(base, "base");
            return getROOT().resolve(o0000O00.Oooo00o(o000000.OoooOo0(path.toString(), base.toString()), '\\', '/'));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem fileSystem, int i, OooOO0O oooOO0O) {
        this(classLoader, z, (i & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<OooOO0> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<OooOO0> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        OooOo.OooO0Oo(resources, "getResources(...)");
        ArrayList list = Collections.list(resources);
        OooOo.OooO0Oo(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            i2++;
            URL url = (URL) obj;
            OooOo.OooO0O0(url);
            OooOO0 fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        OooOo.OooO0Oo(resources2, "getResources(...)");
        ArrayList list2 = Collections.list(resources2);
        OooOo.OooO0Oo(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        int size2 = list2.size();
        while (i < size2) {
            Object obj2 = list2.get(i);
            i++;
            URL url2 = (URL) obj2;
            OooOo.OooO0O0(url2);
            OooOO0 jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return OooOo00.Oooo00O(arrayList2, arrayList);
    }

    private final OooOO0 toFileRoot(URL url) {
        if (OooOo.OooO00o(url.getProtocol(), "file")) {
            return new OooOO0(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final OooOO0 toJarRoot(URL url) {
        int iOoooOOO;
        String string = url.toString();
        OooOo.OooO0Oo(string, "toString(...)");
        if (!o0000O00.Oooo0OO(string, "jar:file:", false) || (iOoooOOO = o000000.OoooOOO("!", string, 6)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iOoooOOO);
        OooOo.OooO0Oo(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new OooOO0(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path file, boolean z) throws IOException {
        OooOo.OooO0o0(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) {
        OooOo.OooO0o0(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path dir, boolean z) throws IOException {
        OooOo.OooO0o0(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        OooOo.OooO0o0(source, "source");
        OooOo.OooO0o0(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z) throws IOException {
        OooOo.OooO0o0(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        OooOo.OooO0o0(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (OooOO0 oooOO0 : getRoots()) {
            FileSystem fileSystem = (FileSystem) oooOO0.f33185OooOo0O;
            Path path = (Path) oooOO0.f33186OooOo0o;
            try {
                List<Path> list = fileSystem.list(path.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(Oooo000.OooOo0(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(Companion.removeBase((Path) obj2, path));
                }
                o00O0O.OooOo0o(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return OooOo00.Oooo0o0(linkedHashSet);
        }
        throw new FileNotFoundException(OooO00o.OooO(dir, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        OooOo.OooO0o0(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<OooOO0> it = getRoots().iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            OooOO0 next = it.next();
            FileSystem fileSystem = (FileSystem) next.f33185OooOo0O;
            Path path = (Path) next.f33186OooOo0o;
            List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(Oooo000.OooOo0(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(Companion.removeBase((Path) obj2, path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                o00O0O.OooOo0o(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (z) {
            return OooOo00.Oooo0o0(linkedHashSet);
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        OooOo.OooO0o0(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (OooOO0 oooOO0 : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) oooOO0.f33185OooOo0O).metadataOrNull(((Path) oooOO0.f33186OooOo0o).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        OooOo.OooO0o0(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(OooO00o.OooO(file, "file not found: "));
        }
        String relativePath = toRelativePath(file);
        for (OooOO0 oooOO0 : getRoots()) {
            try {
                return ((FileSystem) oooOO0.f33185OooOo0O).openReadOnly(((Path) oooOO0.f33186OooOo0o).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(OooO00o.OooO(file, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z, boolean z2) throws IOException {
        OooOo.OooO0o0(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path file, boolean z) throws IOException {
        OooOo.OooO0o0(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path file) throws FileNotFoundException {
        Source source;
        OooOo.OooO0o0(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(OooO00o.OooO(file, "file not found: "));
        }
        Path path = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resourceAsStream == null || (source = Okio.source(resourceAsStream)) == null) {
            throw new FileNotFoundException(OooO00o.OooO(file, "file not found: "));
        }
        return source;
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z, FileSystem systemFileSystem) {
        OooOo.OooO0o0(classLoader, "classLoader");
        OooOo.OooO0o0(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots$delegate = o0OOO0.OooO0oo(new ResourceFileSystem$roots$2(this));
        if (z) {
            getRoots().size();
        }
    }
}
