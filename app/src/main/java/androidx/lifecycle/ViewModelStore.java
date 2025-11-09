package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public class ViewModelStore {
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Iterator<ViewModel> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        this.map.clear();
    }

    public final ViewModel get(String key) {
        OooOo.OooO0o0(key, "key");
        return this.map.get(key);
    }

    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    public final void put(String key, ViewModel viewModel) {
        OooOo.OooO0o0(key, "key");
        OooOo.OooO0o0(viewModel, "viewModel");
        ViewModel viewModelPut = this.map.put(key, viewModel);
        if (viewModelPut != null) {
            viewModelPut.clear$lifecycle_viewmodel_release();
        }
    }
}
