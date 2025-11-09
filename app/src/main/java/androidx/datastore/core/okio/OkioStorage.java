package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00OOOoO.o0000O;
import o00OOOoO.o000O0Oo;
import oo00o.OooO0OO;

/* loaded from: classes.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();
    private final OooO0OO canonicalPath$delegate;
    private final o00O0O coordinatorProducer;
    private final o0000O fileSystem;
    private final OooO0O0 producePath;
    private final OkioSerializer<T> serializer;

    /* renamed from: androidx.datastore.core.okio.OkioStorage$1 */
    public static final class C03291 extends Oooo000 implements o00O0O {
        public static final C03291 INSTANCE = new C03291();

        public C03291() {
            super(2);
        }

        @Override // o00O0Oo.o00O0O
        public final InterProcessCoordinator invoke(o000O0Oo path, o0000O o0000o2) {
            OooOo.OooO0o0(path, "path");
            OooOo.OooO0o0(o0000o2, "<anonymous parameter 1>");
            return OkioStorageKt.createSingleProcessCoordinator(path);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* renamed from: androidx.datastore.core.okio.OkioStorage$createConnection$2 */
    public static final class C03302 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ OkioStorage<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03302(OkioStorage<T> okioStorage) {
            super(0);
            this.this$0 = okioStorage;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13515invoke();
            return oo00o.OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13515invoke() {
            Companion companion = OkioStorage.Companion;
            Synchronizer activeFilesLock = companion.getActiveFilesLock();
            OkioStorage<T> okioStorage = this.this$0;
            synchronized (activeFilesLock) {
                companion.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().f32580OooOo0O.OooOOoo());
            }
        }
    }

    public OkioStorage(o0000O fileSystem, OkioSerializer<T> serializer, o00O0O coordinatorProducer, OooO0O0 producePath) {
        OooOo.OooO0o0(fileSystem, "fileSystem");
        OooOo.OooO0o0(serializer, "serializer");
        OooOo.OooO0o0(coordinatorProducer, "coordinatorProducer");
        OooOo.OooO0o0(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath$delegate = o0OOO0.OooO0oo(new OkioStorage$canonicalPath$2(this));
    }

    public final o000O0Oo getCanonicalPath() {
        return (o000O0Oo) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        String strOooOOoo = getCanonicalPath().f32580OooOo0O.OooOOoo();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(strOooOOoo)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strOooOOoo + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(strOooOOoo);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new C03302(this));
    }

    public /* synthetic */ OkioStorage(o0000O o0000o2, OkioSerializer okioSerializer, o00O0O o00o0o, OooO0O0 oooO0O0, int i, OooOO0O oooOO0O) {
        this(o0000o2, okioSerializer, (i & 4) != 0 ? C03291.INSTANCE : o00o0o, oooO0O0);
    }
}
