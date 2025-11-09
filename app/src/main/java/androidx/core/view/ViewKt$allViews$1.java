package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.InterfaceC3173h3;
import java.util.Iterator;
import o00O0.o000OOo;
import o00O0Oo.o00O0O;

@o00O0OO0.OooO(m13471c = "androidx.core.view.ViewKt$allViews$1", m13472f = "View.kt", m13473l = {InterfaceC3173h3.a.b.f8804j, 412}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewKt$allViews$1 extends o00O0OO0.OooOOO implements o00O0O {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, o00O0O0O.OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$this_allViews = view;
    }

    @Override // o00O0OO0.OooO00o
    public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, oooO0OO);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o00O0o.o000oOoO o000oooo2 = (o00O0o.o000oOoO) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = o000oooo2;
            this.label = 1;
            o000oooo2.OooO00o(view, this);
            return obj3;
        }
        Object obj4 = oo00o.OooOo.f33195OooO00o;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return obj4;
        }
        o00O0o.o000oOoO o000oooo3 = (o00O0o.o000oOoO) this.L$0;
        o000OOo.OooOO0O(obj);
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            o00O0o.Oooo000 descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            o000oooo3.getClass();
            Iterator it = descendants.iterator();
            o00O0o.Oooo0 oooo0 = (o00O0o.Oooo0) o000oooo3;
            if (it.hasNext()) {
                oooo0.f31419OooOo = it;
                oooo0.f31420OooOo0O = 2;
                oooo0.f31422OooOoO0 = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o00O0o.o000oOoO o000oooo2, o00O0O0O.OooO0OO oooO0OO) {
        return ((ViewKt$allViews$1) create(o000oooo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }
}
