package raw.databinding;
import com.shopping.app.R;
import com.shopping.app.BR;
import com.shopping.app.databinding.ItemProductBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductBindingImpl extends ItemProductBinding {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivImage.setTag(null);
        this.llProductItem.setTag(null);
        this.tvPrice.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.dataHolder == variableId) {
            setDataHolder((com.shopping.app.data.model.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDataHolder(@Nullable com.shopping.app.data.model.Product DataHolder) {
        this.mDataHolder = DataHolder;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dataHolder);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Double dataHolderPrice = null;
        java.lang.String tvPriceAndroidStringCurrencyUnitDataHolderPrice = null;
        java.lang.String dataHolderImage = null;
        java.lang.String dataHolderTitle = null;
        com.shopping.app.data.model.Product dataHolder = mDataHolder;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dataHolder != null) {
                    // read dataHolder.price
                    dataHolderPrice = dataHolder.getPrice();
                    // read dataHolder.image
                    dataHolderImage = dataHolder.getImage();
                    // read dataHolder.title
                    dataHolderTitle = dataHolder.getTitle();
                }


                // read @android:string/currency_unit
                tvPriceAndroidStringCurrencyUnitDataHolderPrice = tvPrice.getResources().getString(R.string.currency_unit, dataHolderPrice);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.shopping.app.utils.BindingAdapters.loadImage(this.ivImage, dataHolderImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, tvPriceAndroidStringCurrencyUnitDataHolderPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, dataHolderTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dataHolder
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}