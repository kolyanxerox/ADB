package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.ironsource.InterfaceC3173h3;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o0Oo0oo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oO.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {
    private SharedPreferencesBackend backend;
    private Context context;
    private SharedPreferencesListEncoder listEncoder;

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {134}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1 */
    public static final class C44871 extends OooOOOO implements o00O0O {
        final /* synthetic */ List<String> $allowList;
        int label;

        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1 */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ List<String> $allowList;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<String> list, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$allowList = list;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, oooO0OO);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(MutablePreferences mutablePreferences, OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(mutablePreferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                List<String> list = this.$allowList;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        mutablePreferences.remove(PreferencesKeys.booleanKey((String) it.next()));
                    }
                } else {
                    mutablePreferences.clear();
                }
                return OooOo.f33195OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44871(List<String> list, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$allowList = list;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return SharedPreferencesPlugin.this.new C44871(this.$allowList, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            Context context = SharedPreferencesPlugin.this.context;
            if (context == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("context");
                throw null;
            }
            DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, null);
            this.label = 1;
            Object objEdit = PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this);
            return objEdit == oooOo00 ? oooOo00 : objEdit;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44871) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", m13472f = "SharedPreferencesPlugin.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2 */
    public static final class C44882 extends OooOOOO implements o00O0O {
        final /* synthetic */ Preferences.Key<String> $stringKey;
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44882(Preferences.Key<String> key, String str, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$stringKey = key;
            this.$value = str;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C44882 c44882 = new C44882(this.$stringKey, this.$value, oooO0OO);
            c44882.L$0 = obj;
            return c44882;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(MutablePreferences mutablePreferences, OooO0OO oooO0OO) {
            return ((C44882) create(mutablePreferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            mutablePreferences.set(this.$stringKey, this.$value);
            return OooOo.f33195OooO00o;
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {150}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1 */
    public static final class C44891 extends OooOOOO implements o00O0O {
        final /* synthetic */ List<String> $allowList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44891(List<String> list, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$allowList = list;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return SharedPreferencesPlugin.this.new C44891(this.$allowList, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
            List<String> list = this.$allowList;
            this.label = 1;
            Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
            return prefs == oooOo00 ? oooOo00 : prefs;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44891) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {174}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1 */
    public static final class C44901 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ o0Oo0oo $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44901(String str, SharedPreferencesPlugin sharedPreferencesPlugin, o0Oo0oo o0oo0oo, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C44901(this.$key, this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o0Oo0oo o0oo0oo;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final Preferences.Key<Boolean> keyBooleanKey = PreferencesKeys.booleanKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    kotlin.jvm.internal.OooOo.OooOO0o("context");
                    throw null;
                }
                final o0OoOoOo data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1

                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C44812<T> implements o0O000Oo {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ o0O000Oo $this_unsafeFlow;

                        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2", m13472f = "SharedPreferencesPlugin.kt", m13473l = {223}, m13474m = "emit")
                        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(OooO0OO oooO0OO) {
                                super(oooO0OO);
                            }

                            @Override // o00O0OO0.OooO00o
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C44812.this.emit(null, this);
                            }
                        }

                        public C44812(o0O000Oo o0o000oo, Preferences.Key key) {
                            this.$this_unsafeFlow = o0o000oo;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // o00O0ooo.o0O000Oo
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.C44812.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.C44812.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L37
                                if (r2 != r3) goto L2f
                                java.lang.Object r5 = r0.L$3
                                o00O0ooo.o0O000Oo r5 = (o00O0ooo.o0O000Oo) r5
                                java.lang.Object r5 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1 r5 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.C44812.AnonymousClass1) r5
                                o00O0.o000OOo.OooOO0O(r6)
                                goto L59
                            L2f:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L37:
                                o00O0.o000OOo.OooOO0O(r6)
                                o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                r2 = 0
                                r0.L$0 = r2
                                r0.L$1 = r2
                                r0.L$2 = r2
                                r0.L$3 = r2
                                r2 = 0
                                r0.I$0 = r2
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L59
                                return r1
                            L59:
                                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1.C44812.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                        }
                    }

                    @Override // o00O0ooo.o0OoOoOo
                    public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                        Object objCollect = data.collect(new C44812(o0o000oo, keyBooleanKey), oooO0OO);
                        return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                    }
                };
                o0Oo0oo o0oo0oo2 = this.$value;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = o0oo0oo2;
                this.label = 1;
                Object objOooOOO = o0o0000.OooOOO(o0oooooo, this);
                if (objOooOOO == oooOo00) {
                    return oooOo00;
                }
                o0oo0oo = o0oo0oo2;
                obj = objOooOOO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo0oo = (o0Oo0oo) this.L$2;
                o000OOo.OooOO0O(obj);
            }
            o0oo0oo.f28880OooOo0O = obj;
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44901) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {188}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1 */
    public static final class C44911 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ o0Oo0oo $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44911(String str, SharedPreferencesPlugin sharedPreferencesPlugin, o0Oo0oo o0oo0oo, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C44911(this.$key, this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o0Oo0oo o0oo0oo;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    kotlin.jvm.internal.OooOo.OooOO0o("context");
                    throw null;
                }
                final o0OoOoOo data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                final SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
                o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1

                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C44822<T> implements o0O000Oo {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ o0O000Oo $this_unsafeFlow;
                        final /* synthetic */ SharedPreferencesPlugin this$0;

                        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2", m13472f = "SharedPreferencesPlugin.kt", m13473l = {223}, m13474m = "emit")
                        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(OooO0OO oooO0OO) {
                                super(oooO0OO);
                            }

                            @Override // o00O0OO0.OooO00o
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C44822.this.emit(null, this);
                            }
                        }

                        public C44822(o0O000Oo o0o000oo, Preferences.Key key, SharedPreferencesPlugin sharedPreferencesPlugin) {
                            this.$this_unsafeFlow = o0o000oo;
                            this.$preferencesKey$inlined = key;
                            this.this$0 = sharedPreferencesPlugin;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // o00O0ooo.o0O000Oo
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.C44822.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.C44822.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L37
                                if (r2 != r3) goto L2f
                                java.lang.Object r5 = r0.L$3
                                o00O0ooo.o0O000Oo r5 = (o00O0ooo.o0O000Oo) r5
                                java.lang.Object r5 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1 r5 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.C44822.AnonymousClass1) r5
                                o00O0.o000OOo.OooOO0O(r6)
                                goto L65
                            L2f:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L37:
                                o00O0.o000OOo.OooOO0O(r6)
                                o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin r2 = r4.this$0
                                io.flutter.plugins.sharedpreferences.SharedPreferencesListEncoder r2 = io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.access$getListEncoder$p(r2)
                                java.lang.Object r5 = io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt.transformPref(r5, r2)
                                java.lang.Double r5 = (java.lang.Double) r5
                                r2 = 0
                                r0.L$0 = r2
                                r0.L$1 = r2
                                r0.L$2 = r2
                                r0.L$3 = r2
                                r2 = 0
                                r0.I$0 = r2
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L65
                                return r1
                            L65:
                                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1.C44822.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                        }
                    }

                    @Override // o00O0ooo.o0OoOoOo
                    public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                        Object objCollect = data.collect(new C44822(o0o000oo, keyStringKey, sharedPreferencesPlugin), oooO0OO);
                        return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                    }
                };
                o0Oo0oo o0oo0oo2 = this.$value;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = o0oo0oo2;
                this.label = 1;
                Object objOooOOO = o0o0000.OooOOO(o0oooooo, this);
                if (objOooOOO == oooOo00) {
                    return oooOo00;
                }
                o0oo0oo = o0oo0oo2;
                obj = objOooOOO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo0oo = (o0Oo0oo) this.L$2;
                o000OOo.OooOO0O(obj);
            }
            o0oo0oo.f28880OooOo0O = obj;
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44911) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {160}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1 */
    public static final class C44921 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ o0Oo0oo $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44921(String str, SharedPreferencesPlugin sharedPreferencesPlugin, o0Oo0oo o0oo0oo, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C44921(this.$key, this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o0Oo0oo o0oo0oo;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final Preferences.Key<Long> keyLongKey = PreferencesKeys.longKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    kotlin.jvm.internal.OooOo.OooOO0o("context");
                    throw null;
                }
                final o0OoOoOo data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1

                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C44832<T> implements o0O000Oo {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ o0O000Oo $this_unsafeFlow;

                        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2", m13472f = "SharedPreferencesPlugin.kt", m13473l = {223}, m13474m = "emit")
                        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(OooO0OO oooO0OO) {
                                super(oooO0OO);
                            }

                            @Override // o00O0OO0.OooO00o
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C44832.this.emit(null, this);
                            }
                        }

                        public C44832(o0O000Oo o0o000oo, Preferences.Key key) {
                            this.$this_unsafeFlow = o0o000oo;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // o00O0ooo.o0O000Oo
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.C44832.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.C44832.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L37
                                if (r2 != r3) goto L2f
                                java.lang.Object r5 = r0.L$3
                                o00O0ooo.o0O000Oo r5 = (o00O0ooo.o0O000Oo) r5
                                java.lang.Object r5 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1 r5 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.C44832.AnonymousClass1) r5
                                o00O0.o000OOo.OooOO0O(r6)
                                goto L59
                            L2f:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L37:
                                o00O0.o000OOo.OooOO0O(r6)
                                o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                r2 = 0
                                r0.L$0 = r2
                                r0.L$1 = r2
                                r0.L$2 = r2
                                r0.L$3 = r2
                                r2 = 0
                                r0.I$0 = r2
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L59
                                return r1
                            L59:
                                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1.C44832.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                        }
                    }

                    @Override // o00O0ooo.o0OoOoOo
                    public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                        Object objCollect = data.collect(new C44832(o0o000oo, keyLongKey), oooO0OO);
                        return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                    }
                };
                o0Oo0oo o0oo0oo2 = this.$value;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = o0oo0oo2;
                this.label = 1;
                Object objOooOOO = o0o0000.OooOOO(o0oooooo, this);
                if (objOooOOO == oooOo00) {
                    return oooOo00;
                }
                o0oo0oo = o0oo0oo2;
                obj = objOooOOO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo0oo = (o0Oo0oo) this.L$2;
                o000OOo.OooOO0O(obj);
            }
            o0oo0oo.f28880OooOo0O = obj;
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44921) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", m13472f = "SharedPreferencesPlugin.kt", m13473l = {256, 258}, m13474m = "getPrefs")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 */
    public static final class C44931 extends o00O0OO0.OooO0OO {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C44931(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedPreferencesPlugin.this.getPrefs(null, this);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {InterfaceC3173h3.c.b.f8810b}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1 */
    public static final class C44941 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ o0Oo0oo $value;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44941(String str, SharedPreferencesPlugin sharedPreferencesPlugin, o0Oo0oo o0oo0oo, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C44941(this.$key, this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o0Oo0oo o0oo0oo;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    kotlin.jvm.internal.OooOo.OooOO0o("context");
                    throw null;
                }
                final o0OoOoOo data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1

                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C44842<T> implements o0O000Oo {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ o0O000Oo $this_unsafeFlow;

                        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2", m13472f = "SharedPreferencesPlugin.kt", m13473l = {223}, m13474m = "emit")
                        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(OooO0OO oooO0OO) {
                                super(oooO0OO);
                            }

                            @Override // o00O0OO0.OooO00o
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C44842.this.emit(null, this);
                            }
                        }

                        public C44842(o0O000Oo o0o000oo, Preferences.Key key) {
                            this.$this_unsafeFlow = o0o000oo;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // o00O0ooo.o0O000Oo
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.C44842.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.C44842.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L37
                                if (r2 != r3) goto L2f
                                java.lang.Object r5 = r0.L$3
                                o00O0ooo.o0O000Oo r5 = (o00O0ooo.o0O000Oo) r5
                                java.lang.Object r5 = r0.L$1
                                io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1 r5 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.C44842.AnonymousClass1) r5
                                o00O0.o000OOo.OooOO0O(r6)
                                goto L59
                            L2f:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L37:
                                o00O0.o000OOo.OooOO0O(r6)
                                o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                                androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                                androidx.datastore.preferences.core.Preferences$Key r2 = r4.$preferencesKey$inlined
                                java.lang.Object r5 = r5.get(r2)
                                r2 = 0
                                r0.L$0 = r2
                                r0.L$1 = r2
                                r0.L$2 = r2
                                r0.L$3 = r2
                                r2 = 0
                                r0.I$0 = r2
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L59
                                return r1
                            L59:
                                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1.C44842.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                        }
                    }

                    @Override // o00O0ooo.o0OoOoOo
                    public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                        Object objCollect = data.collect(new C44842(o0o000oo, keyStringKey), oooO0OO);
                        return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                    }
                };
                o0Oo0oo o0oo0oo2 = this.$value;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = o0oo0oo2;
                this.label = 1;
                Object objOooOOO = o0o0000.OooOOO(o0oooooo, this);
                if (objOooOOO == oooOo00) {
                    return oooOo00;
                }
                o0oo0oo = o0oo0oo2;
                obj = objOooOOO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo0oo = (o0Oo0oo) this.L$2;
                o000OOo.OooOO0O(obj);
            }
            o0oo0oo.f28880OooOo0O = obj;
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44941) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {81}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1 */
    public static final class C44951 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1 */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ Preferences.Key<Boolean> $boolKey;
            final /* synthetic */ boolean $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<Boolean> key, boolean z, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$boolKey = key;
                this.$value = z;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$boolKey, this.$value, oooO0OO);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(MutablePreferences mutablePreferences, OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(mutablePreferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                mutablePreferences.set(this.$boolKey, Boolean.valueOf(this.$value));
                return OooOo.f33195OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44951(String str, SharedPreferencesPlugin sharedPreferencesPlugin, boolean z, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = z;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C44951(this.$key, this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Preferences.Key<Boolean> keyBooleanKey = PreferencesKeys.booleanKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    kotlin.jvm.internal.OooOo.OooOO0o("context");
                    throw null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(keyBooleanKey, this.$value, null);
                this.L$0 = null;
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44951) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {128}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1 */
    public static final class C44961 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ String $valueString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44961(String str, String str2, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.$valueString = str2;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return SharedPreferencesPlugin.this.new C44961(this.$key, this.$valueString, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$valueString;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44961) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {107}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1 */
    public static final class C44971 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ double $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1 */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ Preferences.Key<Double> $doubleKey;
            final /* synthetic */ double $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<Double> key, double d, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$doubleKey = key;
                this.$value = d;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$doubleKey, this.$value, oooO0OO);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(MutablePreferences mutablePreferences, OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(mutablePreferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                mutablePreferences.set(this.$doubleKey, new Double(this.$value));
                return OooOo.f33195OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44971(String str, SharedPreferencesPlugin sharedPreferencesPlugin, double d, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = d;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C44971(this.$key, this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Preferences.Key<Double> keyDoubleKey = PreferencesKeys.doubleKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    kotlin.jvm.internal.OooOo.OooOO0o("context");
                    throw null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(keyDoubleKey, this.$value, null);
                this.L$0 = null;
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44971) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {117}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1 */
    public static final class C44981 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44981(String str, String str2, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.$value = str2;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return SharedPreferencesPlugin.this.new C44981(this.$key, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44981) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {99}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1 */
    public static final class C44991 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ long $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {}, m13474m = "invokeSuspend")
        /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1 */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ Preferences.Key<Long> $intKey;
            final /* synthetic */ long $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<Long> key, long j, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$intKey = key;
                this.$value = j;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$intKey, this.$value, oooO0OO);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(MutablePreferences mutablePreferences, OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(mutablePreferences, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                mutablePreferences.set(this.$intKey, new Long(this.$value));
                return OooOo.f33195OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44991(String str, SharedPreferencesPlugin sharedPreferencesPlugin, long j, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = j;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C44991(this.$key, this.this$0, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Preferences.Key<Long> keyLongKey = PreferencesKeys.longKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    kotlin.jvm.internal.OooOo.OooOO0o("context");
                    throw null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(keyLongKey, this.$value, null);
                this.L$0 = null;
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C44991) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1", m13472f = "SharedPreferencesPlugin.kt", m13473l = {87}, m13474m = "invokeSuspend")
    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1 */
    public static final class C45001 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45001(String str, String str2, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = str;
            this.$value = str2;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return SharedPreferencesPlugin.this.new C45001(this.$key, this.$value, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C45001) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    public final Object dataStoreSetString(String str, String str2, OooO0OO oooO0OO) {
        Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(str);
        Context context = this.context;
        if (context != null) {
            Object objEdit = PreferencesKt.edit(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context), new C44882(keyStringKey, str2, null), oooO0OO);
            return objEdit == OooOo00.f31365OooOo0O ? objEdit : OooOo.f33195OooO00o;
        }
        kotlin.jvm.internal.OooOo.OooOO0o("context");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0080, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b8, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x00b6 -> B:69:0x00b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getPrefs(java.util.List<java.lang.String> r11, o00O0O0O.OooO0OO r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getPrefs(java.util.List, o00O0O0O.OooO0OO):java.lang.Object");
    }

    public final Object getValueByKey(final Preferences.Key<?> key, OooO0OO oooO0OO) {
        Context context = this.context;
        if (context != null) {
            final o0OoOoOo data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
            return o0o0000.OooOOO(new o0OoOoOo() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2 */
                public static final class C44852<T> implements o0O000Oo {
                    final /* synthetic */ Preferences.Key $key$inlined;
                    final /* synthetic */ o0O000Oo $this_unsafeFlow;

                    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", m13472f = "SharedPreferencesPlugin.kt", m13473l = {223}, m13474m = "emit")
                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(OooO0OO oooO0OO) {
                            super(oooO0OO);
                        }

                        @Override // o00O0OO0.OooO00o
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C44852.this.emit(null, this);
                        }
                    }

                    public C44852(o0O000Oo o0o000oo, Preferences.Key key) {
                        this.$this_unsafeFlow = o0o000oo;
                        this.$key$inlined = key;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // o00O0ooo.o0O000Oo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.C44852.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.C44852.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L37
                            if (r2 != r3) goto L2f
                            java.lang.Object r5 = r0.L$3
                            o00O0ooo.o0O000Oo r5 = (o00O0ooo.o0O000Oo) r5
                            java.lang.Object r5 = r0.L$1
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1 r5 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.C44852.AnonymousClass1) r5
                            o00O0.o000OOo.OooOO0O(r6)
                            goto L59
                        L2f:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L37:
                            o00O0.o000OOo.OooOO0O(r6)
                            o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                            androidx.datastore.preferences.core.Preferences$Key r2 = r4.$key$inlined
                            java.lang.Object r5 = r5.get(r2)
                            r2 = 0
                            r0.L$0 = r2
                            r0.L$1 = r2
                            r0.L$2 = r2
                            r0.L$3 = r2
                            r2 = 0
                            r0.I$0 = r2
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L59
                            return r1
                        L59:
                            oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1.C44852.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                    }
                }

                @Override // o00O0ooo.o0OoOoOo
                public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO2) {
                    Object objCollect = data.collect(new C44852(o0o000oo, key), oooO0OO2);
                    return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                }
            }, oooO0OO);
        }
        kotlin.jvm.internal.OooOo.OooOO0o("context");
        throw null;
    }

    public final Object readAllKeys(OooO0OO oooO0OO) {
        Context context = this.context;
        if (context != null) {
            final o0OoOoOo data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
            return o0o0000.OooOOO(new o0OoOoOo() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

                /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2 */
                public static final class C44862<T> implements o0O000Oo {
                    final /* synthetic */ o0O000Oo $this_unsafeFlow;

                    @OooO(m13471c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", m13472f = "SharedPreferencesPlugin.kt", m13473l = {223}, m13474m = "emit")
                    /* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(OooO0OO oooO0OO) {
                            super(oooO0OO);
                        }

                        @Override // o00O0OO0.OooO00o
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C44862.this.emit(null, this);
                        }
                    }

                    public C44862(o0O000Oo o0o000oo) {
                        this.$this_unsafeFlow = o0o000oo;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // o00O0ooo.o0O000Oo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.C44862.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.C44862.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r0 = new io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L37
                            if (r2 != r3) goto L2f
                            java.lang.Object r5 = r0.L$3
                            o00O0ooo.o0O000Oo r5 = (o00O0ooo.o0O000Oo) r5
                            java.lang.Object r5 = r0.L$1
                            io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1 r5 = (io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.C44862.AnonymousClass1) r5
                            o00O0.o000OOo.OooOO0O(r6)
                            goto L5b
                        L2f:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L37:
                            o00O0.o000OOo.OooOO0O(r6)
                            o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                            java.util.Map r5 = r5.asMap()
                            java.util.Set r5 = r5.keySet()
                            r2 = 0
                            r0.L$0 = r2
                            r0.L$1 = r2
                            r0.L$2 = r2
                            r0.L$3 = r2
                            r2 = 0
                            r0.I$0 = r2
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L5b
                            return r1
                        L5b:
                            oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1.C44862.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                    }
                }

                @Override // o00O0ooo.o0OoOoOo
                public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO2) {
                    Object objCollect = data.collect(new C44862(o0o000oo), oooO0OO2);
                    return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                }
            }, oooO0OO);
        }
        kotlin.jvm.internal.OooOo.OooOO0o("context");
        throw null;
    }

    private final void setUp(BinaryMessenger binaryMessenger, Context context) {
        this.context = context;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(binaryMessenger, this, "data_store");
            this.backend = new SharedPreferencesBackend(binaryMessenger, context, this.listEncoder);
        } catch (Exception e) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e);
        }
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> list, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44871(list, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        return (Map) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44891(list, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0Oo0oo o0oo0oo = new o0Oo0oo();
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44901(key, this, o0oo0oo, null));
        return (Boolean) o0oo0oo.f28880OooOo0O;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0Oo0oo o0oo0oo = new o0Oo0oo();
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44911(key, this, o0oo0oo, null));
        return (Double) o0oo0oo.f28880OooOo0O;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0Oo0oo o0oo0oo = new o0Oo0oo();
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44921(key, this, o0oo0oo, null));
        return (Long) o0oo0oo.f28880OooOo0O;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        return o00O0.OooOo00.Oooo0o0(((Map) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new SharedPreferencesPlugin$getKeys$prefs$1(this, list, null))).keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        List list;
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        String string = getString(key, options);
        if (string == null || o0000O00.Oooo0OO(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) || !o0000O00.Oooo0OO(string, SharedPreferencesPluginKt.LIST_PREFIX, false) || (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0Oo0oo o0oo0oo = new o0Oo0oo();
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44941(key, this, o0oo0oo, null));
        return (String) o0oo0oo.f28880OooOo0O;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        String string = getString(key, options);
        if (string != null) {
            return o0000O00.Oooo0OO(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) ? new StringListResult(string, StringListLookupResultType.JSON_ENCODED) : o0000O00.Oooo0OO(string, SharedPreferencesPluginKt.LIST_PREFIX, false) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.OooOo.OooO0o0(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.OooOo.OooO0Oo(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        kotlin.jvm.internal.OooOo.OooO0Oo(applicationContext, "getApplicationContext(...)");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.OooOo.OooO0o0(binding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.Companion;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.OooOo.OooO0Oo(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null, "data_store");
        SharedPreferencesBackend sharedPreferencesBackend = this.backend;
        if (sharedPreferencesBackend != null) {
            sharedPreferencesBackend.tearDown();
        }
        this.backend = null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String key, boolean z, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44951(key, this, z, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44961(key, OooO0oO.OooOo.OooOO0(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value)), null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String key, double d, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44971(key, this, d, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44981(key, value, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String key, long j, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C44991(key, this, j, null));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String key, String value, SharedPreferencesPigeonOptions options) throws Throwable {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        kotlin.jvm.internal.OooOo.OooO0o0(options, "options");
        o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new C45001(key, value, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public SharedPreferencesPlugin(SharedPreferencesListEncoder listEncoder) {
        this();
        kotlin.jvm.internal.OooOo.OooO0o0(listEncoder, "listEncoder");
        this.listEncoder = listEncoder;
    }
}
