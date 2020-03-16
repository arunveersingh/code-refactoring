package com.arunveersingh.switchstatements.after.waytwo;

/**
 * Interface; need to be implemented in case new type of filter is to be introduced.
 * By using this polymorphic behaviour we can retain "open closed principle".
 * Only need to change at one place if there are changes in existing FilterType,
 * without touching the code at multiple places.
 * Only need to introduce a new implementation of this interface in case new filter is required.
 * No need to touch code at multiple places as needed in case of scattered switch statements.
 *
 * @see <code>{@link InFilterType}</code>
 *      <code>{@link EqualsFilterType}</code>
 * @author arunveersingh9@gmail.com
 */
public interface FilterType {
    void print(BusinessClass businessClass, Data data);
    void somethingElse(BusinessClass businessClass, Data data);
}
