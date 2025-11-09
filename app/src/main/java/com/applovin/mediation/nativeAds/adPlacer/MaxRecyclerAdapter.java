package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.C0996c5;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1333R;
import java.util.Collection;

/* loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {

    /* renamed from: a */
    private final MaxAdPlacer f3329a;

    /* renamed from: b */
    private final RecyclerView.Adapter f3330b;

    /* renamed from: c */
    private final C1331b f3331c;

    /* renamed from: d */
    private RecyclerView f3332d;

    /* renamed from: e */
    private C0996c5 f3333e;

    /* renamed from: f */
    private MaxAdPlacer.Listener f3334f;

    /* renamed from: g */
    private int f3335g;

    /* renamed from: h */
    private AdPositionBehavior f3336h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ViewGroup f3338a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f3338a = (ViewGroup) view.findViewById(C1333R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f3338a;
        }
    }

    /* renamed from: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter$a */
    public class C1330a implements C0996c5.a {
        public C1330a() {
        }

        @Override // com.applovin.impl.C0996c5.a
        /* renamed from: a */
        public void mo485a(int i, int i2) {
            MaxRecyclerAdapter.this.f3329a.updateFillablePositions(i, Math.min(MaxRecyclerAdapter.this.f3335g + i2, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    /* renamed from: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter$b */
    public class C1331b extends RecyclerView.AdapterDataObserver {
        private C1331b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f3329a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f3329a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            boolean z = i + i2 >= MaxRecyclerAdapter.this.f3330b.getItemCount();
            if (MaxRecyclerAdapter.this.f3336h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f3336h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f3329a.getAdjustedPosition(i);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f3329a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            int itemCount = MaxRecyclerAdapter.this.f3330b.getItemCount();
            boolean z = i + i2 >= itemCount;
            if (MaxRecyclerAdapter.this.f3336h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f3336h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f3329a.getAdjustedPosition(i);
            int adjustedCount = MaxRecyclerAdapter.this.f3329a.getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f3329a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f3329a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f3329a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i2), size);
        }

        public /* synthetic */ C1331b(MaxRecyclerAdapter maxRecyclerAdapter, C1330a c1330a) {
            this();
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        C1331b c1331b = new C1331b(this, null);
        this.f3331c = c1331b;
        this.f3335g = 8;
        this.f3336h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f3329a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f3330b = adapter;
        adapter.registerAdapterDataObserver(c1331b);
    }

    public void destroy() {
        try {
            this.f3330b.unregisterAdapterDataObserver(this.f3331c);
        } catch (Exception unused) {
        }
        this.f3329a.destroy();
        C0996c5 c0996c5 = this.f3333e;
        if (c0996c5 != null) {
            c0996c5.m481a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f3329a;
    }

    public int getAdjustedPosition(int i) {
        return this.f3329a.getAdjustedPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f3329a.getAdjustedCount(this.f3330b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (this.f3330b.hasStableIds()) {
            return this.f3329a.isFilledPosition(i) ? this.f3329a.getAdItemId(i) : this.f3330b.getItemId(this.f3329a.getOriginalPosition(i));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f3329a.isAdPosition(i)) {
            return -42;
        }
        return this.f3330b.getItemViewType(this.f3329a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f3329a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f3329a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f3334f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f3334f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f3334f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f3334f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f3332d = recyclerView;
        C0996c5 c0996c5 = new C0996c5(recyclerView);
        this.f3333e = c0996c5;
        c0996c5.m483a(new C1330a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f3333e.m482a(viewHolder.itemView, i);
        if (!this.f3329a.isAdPosition(i)) {
            this.f3330b.onBindViewHolder(viewHolder, this.f3329a.getOriginalPosition(i));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f3329a.getAdSize(i);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f3329a.renderAd(i, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.f3330b.onCreateViewHolder(viewGroup, i);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1333R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.f3332d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f3332d = null;
        C0996c5 c0996c5 = this.f3333e;
        if (c0996c5 != null) {
            c0996c5.m481a();
            this.f3333e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f3330b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f3330b.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f3330b.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C0996c5 c0996c5 = this.f3333e;
        if (c0996c5 != null) {
            c0996c5.m484b(viewHolder.itemView);
        }
        if (!(viewHolder instanceof MaxAdRecyclerViewHolder)) {
            this.f3330b.onViewRecycled(viewHolder);
            return;
        }
        if (this.f3329a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
        }
        super.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f3336h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f3330b.unregisterAdapterDataObserver(this.f3331c);
        this.f3330b.setHasStableIds(z);
        this.f3330b.registerAdapterDataObserver(this.f3331c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f3334f = listener;
    }

    public void setLookAhead(int i) {
        this.f3335g = i;
    }
}
