package androidx.datastore.core;

import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOO0;
import o00O0O0O.OooOO0O;
import o00O0O0O.OooOOO0;
import o00O0Oo.o00O0O;

/* loaded from: classes.dex */
public final class UpdatingDataContextElement implements OooOO0 {
    public static final Companion Companion = new Companion(null);
    private static final String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    private final DataStoreImpl<?> instance;
    private final UpdatingDataContextElement parent;

    public static final class Companion {

        public static final class Key implements OooOO0O {
            public static final Key INSTANCE = new Key();

            private Key() {
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core_release() {
            return UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        private Companion() {
        }
    }

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl<?> instance) {
        OooOo.OooO0o0(instance, "instance");
        this.parent = updatingDataContextElement;
        this.instance = instance;
    }

    public final void checkNotUpdating(DataStore<?> candidate) {
        OooOo.OooO0o0(candidate, "candidate");
        if (this.instance == candidate) {
            throw new IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
        }
        UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(candidate);
        }
    }

    @Override // o00O0O0O.OooOOO0
    public <R> R fold(R r, o00O0O operation) {
        OooOo.OooO0o0(operation, "operation");
        return (R) operation.invoke(r, this);
    }

    @Override // o00O0O0O.OooOOO0
    public <E extends OooOO0> E get(OooOO0O oooOO0O) {
        return (E) OooO00o.OooO00o.OooO(this, oooOO0O);
    }

    @Override // o00O0O0O.OooOO0
    public OooOO0O getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // o00O0O0O.OooOOO0
    public OooOOO0 minusKey(OooOO0O oooOO0O) {
        return OooO00o.OooO00o.OooOOoo(this, oooOO0O);
    }

    @Override // o00O0O0O.OooOOO0
    public OooOOO0 plus(OooOOO0 oooOOO0) {
        return OooO00o.OooO00o.OooOo00(this, oooOOO0);
    }
}
