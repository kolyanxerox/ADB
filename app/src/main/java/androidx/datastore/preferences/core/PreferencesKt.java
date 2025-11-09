package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class PreferencesKt {

    @OooO(m13471c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m13472f = "Preferences.kt", m13473l = {358}, m13474m = "invokeSuspend")
    /* renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2 */
    public static final class C03482 extends OooOOOO implements o00O0O {
        final /* synthetic */ o00O0O $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03482(o00O0O o00o0o, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$transform = o00o0o;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C03482 c03482 = new C03482(this.$transform, oooO0OO);
            c03482.L$0 = obj;
            return c03482;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(Preferences preferences, OooO0OO oooO0OO) {
            return ((C03482) create(preferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                o000OOo.OooOO0O(obj);
                return mutablePreferences;
            }
            o000OOo.OooOO0O(obj);
            MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
            o00O0O o00o0o = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            return o00o0o.invoke(mutablePreferences2, this) == oooOo00 ? oooOo00 : mutablePreferences2;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, o00O0O o00o0o, OooO0OO oooO0OO) {
        return dataStore.updateData(new C03482(o00o0o, null), oooO0OO);
    }
}
