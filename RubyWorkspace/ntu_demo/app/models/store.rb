class Store < ActiveRecord::Base
  attr_accessible :address, :name, :tel
  belong_to :user
end
