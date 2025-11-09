package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final Oooo000 coordinatorProducer;
    private final OooO0O0 produceFile;
    private final Serializer<T> serializer;

    /* renamed from: androidx.datastore.core.FileStorage$1 */
    public static final class C03071 extends kotlin.jvm.internal.Oooo000 implements Oooo000 {
        public static final C03071 INSTANCE = new C03071();

        public C03071() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public final InterProcessCoordinator invoke(File it) {
            OooOo.OooO0o0(it, "it");
            return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(it);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* renamed from: androidx.datastore.core.FileStorage$createConnection$2 */
    public static final class C03082 extends kotlin.jvm.internal.Oooo000 implements OooO0O0 {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03082(File file) {
            super(0);
            this.$file = file;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13513invoke();
            return oo00o.OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13513invoke() {
            Companion companion = FileStorage.Companion;
            Object activeFilesLock$datastore_core_release = companion.getActiveFilesLock$datastore_core_release();
            File file = this.$file;
            synchronized (activeFilesLock$datastore_core_release) {
                companion.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
            }
        }
    }

    public FileStorage(Serializer<T> serializer, Oooo000 coordinatorProducer, OooO0O0 produceFile) {
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(coordinatorProducer, "coordinatorProducer");
        OooOo.OooO0o0(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() throws IOException {
        File canonicalFile = ((File) this.produceFile.invoke()).getCanonicalFile();
        synchronized (activeFilesLock) {
            String path = canonicalFile.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            OooOo.OooO0Oo(path, "path");
            set.add(path);
        }
        return new FileStorageConnection(canonicalFile, this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(canonicalFile), new C03082(canonicalFile));
    }

    public /* synthetic */ FileStorage(Serializer serializer, Oooo000 oooo000, OooO0O0 oooO0O0, int i, OooOO0O oooOO0O) {
        this(serializer, (i & 2) != 0 ? C03071.INSTANCE : oooo000, oooO0O0);
    }
}
