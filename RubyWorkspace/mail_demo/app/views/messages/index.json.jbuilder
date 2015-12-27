json.array!(@messages) do |message|
  json.extract! message, :id, :subject, :content, :user_id, :receiver_id
  json.url message_url(message, format: :json)
end
