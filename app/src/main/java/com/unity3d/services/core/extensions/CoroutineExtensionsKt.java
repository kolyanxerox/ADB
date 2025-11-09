package com.unity3d.services.core.extensions;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0o;
import o00O0oOo.o000OO;
import o00OO0O0.OooO;
import o00OO0O0.OooO00o;
import o00OO0O0.OooO0o;
import oo00o.OooOO0O;
import oo00o.OooOOO0;

/* loaded from: classes3.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, o000O0o> deferreds = new LinkedHashMap<Object, o000O0o>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof o000O0o) {
                return containsValue((o000O0o) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, o000O0o>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, o000O0o>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<o000O0o> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof o000O0o)) {
                return remove(obj, (o000O0o) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, o000O0o> eldest) {
            OooOo.OooO0o0(eldest, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<o000O0o> values() {
            return getValues();
        }

        public /* bridge */ boolean containsValue(o000O0o o000o0o2) {
            return super.containsValue((Object) o000o0o2);
        }

        public /* bridge */ boolean remove(Object obj, o000O0o o000o0o2) {
            return super.remove(obj, (Object) o000o0o2);
        }
    };
    private static final OooO00o mutex = OooO.OooO00o();

    @o00O0OO0.OooO(m13471c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", m13472f = "CoroutineExtensions.kt", m13473l = {53, 45}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2 */
    public static final class C43282 extends OooOOOO implements o00O0O {
        final /* synthetic */ Oooo000 $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43282(Object obj, Oooo000 oooo000, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$key = obj;
            this.$action = oooo000;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C43282 c43282 = new C43282(this.$key, this.$action, oooO0OO);
            c43282.L$0 = obj;
            return c43282;
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            o000OO o000oo2;
            Object obj2;
            Oooo000 oooo000;
            OooO00o oooO00o;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o000oo2 = (o000OO) this.L$0;
                    OooO00o mutex = CoroutineExtensionsKt.getMutex();
                    Object obj3 = this.$key;
                    Oooo000 oooo0002 = this.$action;
                    this.L$0 = o000oo2;
                    this.L$1 = mutex;
                    this.L$2 = obj3;
                    this.L$3 = oooo0002;
                    this.label = 1;
                    OooO0o oooO0o = (OooO0o) mutex;
                    if (oooO0o.OooO0Oo(this) != oooOo00) {
                        obj2 = obj3;
                        oooo000 = oooo0002;
                        oooO00o = oooO0o;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                    return obj;
                }
                oooo000 = (Oooo000) this.L$3;
                obj2 = this.L$2;
                oooO00o = (OooO00o) this.L$1;
                o000oo2 = (o000OO) this.L$0;
                o000OOo.OooOO0O(obj);
                LinkedHashMap<Object, o000O0o> deferreds = CoroutineExtensionsKt.getDeferreds();
                o000O0o o000o0oOooO0oO = deferreds.get(obj2);
                if (o000o0oOooO0oO == null) {
                    o000o0oOooO0oO = o0000OO0.OooO0oO(o000oo2, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(oooo000, null));
                    deferreds.put(obj2, o000o0oOooO0oO);
                }
                o000O0o o000o0o2 = o000o0oOooO0oO;
                ((OooO0o) oooO00o).OooO0o(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                Object objOooO0OO = o000o0o2.OooO0OO(this);
                return objOooO0OO == oooOo00 ? oooOo00 : objOooO0OO;
            } catch (Throwable th) {
                ((OooO0o) oooO00o).OooO0o(null);
                throw th;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            o000OO o000oo2 = (o000OO) this.L$0;
            OooO00o mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            Oooo000 oooo000 = this.$action;
            OooO0o oooO0o = (OooO0o) mutex;
            oooO0o.OooO0Oo(this);
            try {
                LinkedHashMap<Object, o000O0o> deferreds = CoroutineExtensionsKt.getDeferreds();
                o000O0o o000o0oOooO0oO = deferreds.get(obj2);
                if (o000o0oOooO0oO == null) {
                    o000o0oOooO0oO = o0000OO0.OooO0oO(o000oo2, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(oooo000, null));
                    deferreds.put(obj2, o000o0oOooO0oO);
                }
                o000O0o o000o0o2 = o000o0oOooO0oO;
                oooO0o.OooO0o(null);
                return o000o0o2.OooO0OO(this);
            } catch (Throwable th) {
                oooO0o.OooO0o(null);
                throw th;
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C43282) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    public static final LinkedHashMap<Object, o000O0o> getDeferreds() {
        return deferreds;
    }

    public static final OooO00o getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, Oooo000 oooo000, OooO0OO oooO0OO) {
        return o0000OO0.OooOO0(new C43282(obj, oooo000, null), oooO0OO);
    }

    public static final <R> Object runReturnSuspendCatching(OooO0O0 block) {
        Object objOooO0O0;
        Throwable thOooO00o;
        OooOo.OooO0o0(block, "block");
        try {
            objOooO0O0 = block.invoke();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        return ((objOooO0O0 instanceof OooOO0O) && (thOooO00o = OooOOO0.OooO00o(objOooO0O0)) != null) ? o000OOo.OooO0O0(thOooO00o) : objOooO0O0;
    }

    public static final <R> Object runSuspendCatching(OooO0O0 block) {
        OooOo.OooO0o0(block, "block");
        try {
            return block.invoke();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return o000OOo.OooO0O0(th);
        }
    }
}
